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
    The load should be shared using MPI.

    Run with:
    mpirun -np <num_processors> primes2 <max_num>
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

    // Communication to send the number of prime numbers that were found.
    // Process 0 receives all the counts and prints them.

    if(rank == 0) {

        long int total = 0;
        long int partial_count;

        double begin = cpuSeconds();

        // Process 0 will check: 0, nmax, 2*nmax, ...
        if(isPrime(size)) partial_count = 2; // 2 primes if nmax is prime
        else partial_count = 1; // 1 prime otherwise

        total += partial_count;

        for(i=1; i<size; i++) {
            // Receive prime count from other processes
            MPI_Recv(&partial_count, 1, MPI_LONG, MPI_ANY_SOURCE, 1, MPI_COMM_WORLD, NULL);
            total += partial_count;
        }

        double duration = cpuSeconds() - begin;

        printf("\nNumber of primes found in total: %ld, calculated in %f ms\n\n",
            total,
            duration);

    } else { // Rank is not 0

        // We divide the cycle among the different MPI processes.
        // I/O is automatically redirected.
        // We skip by "chunk" steps to make the processing load more homogeneous.
        long int count = 0;
        for(i=rank; i<=last; i+=size) {
            if(isPrime(i)) {
                count++;
            }
        }

        printf("Process %d on machine %s found %ld primes\n",
            rank,
            name,
            count);

        MPI_Send(&count, 1, MPI_LONG, 0, 1, MPI_COMM_WORLD);
    }

    MPI_Finalize();
    return 0;
}
