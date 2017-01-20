#include <iostream>
#include <stdio.h>
#include <cstdlib>
#include <sys/time.h>
#include "mpi.h"

using namespace std;

bool isPrime(long int x) {
    long int i;
    for(i=2; i<=x/2; i++) {
        if(x%i == 0) return false;
    }
    return true;
}

double cpuSeconds() {
    struct timeval tp;
    gettimeofday(&tp, NULL);
    return (double)tp.tv_sec + (double)tp.tv_usec * 1E-06;
}

/*
    The program prints the number of prime numbers from 2 to argv[1].
    The load is shared between processes.
    The results are collected and summed with MPI_Reduce.

    Run with:
    mpirun -np <num_processors> primes_reduce <max_num>
*/
int main(int argc, char *argv[]) {
    int rank, size, len;
    char name[MPI_MAX_PROCESSOR_NAME];
    long int i;

    long int last = atol(argv[1]); // Last number to check

    MPI_Init(&argc, &argv);

    MPI_Comm_size(MPI_COMM_WORLD, &size);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Get_processor_name(name, &len);

    long int total = 0;
    long int count = 0;

    double begin = cpuSeconds();

    // We divide the cycle among the different MPI processes.
    // We skip by "chunk" steps to make the processing load more homogeneous.
    for(i=rank; i<=last; i+=size) {
        if(isPrime(i)) {
            count++;
        }
    }
    printf("Process %d on machine %s calculated %ld primes.\n", rank, name, count);

    // Process 0 receives all the partial counts, summed into total.
    MPI_Reduce(&count, &total, 1, MPI_LONG, MPI_SUM, 0, MPI_COMM_WORLD);

    double duration = cpuSeconds() - begin;

    if(rank == 0) {
        printf("\nNumber of primes found in total: %ld, calculated in %f ms\n\n",
            total,
            duration);
    }

    MPI_Finalize();

    return 0;
}
