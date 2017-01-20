#include <iostream>
#include <stdio.h>
#include <cstdlib>
#include "mpi.h"

using namespace std;

/*
    This program distributes a set of numbers among 4 processes using MPI_Scatter.

    Run with:
    mpirun -np 4 scatter
*/
int main(int argc, char *argv[]) {
    const int NUM_PROC = 4;
    const int ELEM_COUNT = 3;

    int numtasks, rank, source;
    float sendbuf[NUM_PROC * ELEM_COUNT] = { 1,2,3,4,5,6,7,8,9,10,11,12 };
    float recvbuf[ELEM_COUNT];

    MPI_Init(&argc, &argv);

    MPI_Comm_size(MPI_COMM_WORLD, &numtasks);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);

    if(numtasks == NUM_PROC) {
        source = 0;
        MPI_Scatter(sendbuf, ELEM_COUNT, MPI_FLOAT, recvbuf, ELEM_COUNT, MPI_FLOAT, source, MPI_COMM_WORLD);
        printf("rank = %d; ", rank);
        printf("results: {");
        for(int i=0; i<ELEM_COUNT; i++) {
            printf("%f, ", recvbuf[i]);
        }
        printf("}\n");
    } else {
        printf("Error, you must specify %d tasks\n", NUM_PROC);
    }

    MPI_Finalize();
    return 0;
}
