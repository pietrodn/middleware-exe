#include <iostream>
#include <omp.h>

using namespace std;

int main(int argc, char *argv[]) {

    const int N = 10000;

    int data1[N], data2[N];
    int dist = 0;
    int i;

    #pragma omp parallel for
    for(i=0; i<N; i++) {
        data1[i] = 0;
        data2[i] = i % 2;
    }

    #pragma omp parallel for reduction(+: dist)
    for(i=0; i<N; i++) {
        dist += (data1[i] != data2[i]);
    }

    cout << "Hamming distance: " << dist << endl;

    return 0;
}
