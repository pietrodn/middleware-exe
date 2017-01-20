#include <iostream>
#include <stdio.h>
#include "mpi.h"

using namespace std;

int main(int argc, char *argv[]) {
    MPI_Init(&argc, &argv);
    cout << "Hello World!" << endl;

    int size, rank;
    MPI_Comm_size(MPI_COMM_WORLD, &size);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);

    printf("Size: %d\n", size);
    printf("Rank: %d\n", rank);

    MPI_Finalize();
    return 0;
}
