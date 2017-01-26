/*
    Write the OpenMP code (the minimal fragment of code you need) to count the number of times two given arrays data1 and data2 (of size NUM) have the same value in the same position.
*/

#include <iostream>
#include <cstdlib>
#include <stdio.h>
#include <omp.h>

using namespace std;

int main(int argc, char *argv[]) {

    if(argc < 2) {
        printf("Usage: %s <array_size>\n", argv[0]);
        return 0;
    }
    const int NUM = atoi(argv[1]);
    int *data1 = new int[NUM];
    int *data2 = new int[NUM];

    // Input data: only a quarter of the values are set to be equal in the same position
    #pragma omp parallel for shared(data1, data2)
    for(int i=0; i<NUM; i++) {
        if(i % 4 == 0) {
            data1[i] = data2[i] = 4;
        } else {
            data1[i] = 0;
            data2[i] = -1;
        }
    }

    int counter = 0;
    #pragma omp parallel for shared(data1, data2) reduction(+: counter)
    for(int i=0; i<NUM; i++) {
        if(data1[i] == data2[i]) {
            counter++;
        }
    }

    cout << "The number of identical elements in the same position is " << counter << endl;

}
