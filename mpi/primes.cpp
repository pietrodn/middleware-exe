#include <iostream>
#include <stdio.h>
#include <cstdlib>
#include "mpi.h"

using namespace std;

bool isPrime(long int x) {
    long int i;
    for(i=2; i<=x/2; i++) {
        if(x%i == 0) return false;
    }
    return true;
}

/*
    The program prints all the prime number from 2 to argv[1].
    The load should be shared using MPI.

    Run with:
    mpirun -np <num_processors> primes <max_num>
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

    // We divide the cycle among the different MPI processes.
    // I/O is automatically redirected.
    // We skip by "chunk" steps to make the processing load more homogeneous.
    for(i=rank; i<=last; i+=size) {
        if(isPrime(i)) {
            printf("%ld is prime, calculated by %d on machine %s\n",
                i,
                rank,
                name);
        }
    }

    MPI_Finalize();
    return 0;
}
