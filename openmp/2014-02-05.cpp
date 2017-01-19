#include <iostream>
#include <omp.h>

using namespace std;

int main(int argc, char *argv[]) {

    const long int N = 1000000;

    long int data[N], i, max, localmax;

    #pragma omp parallel for shared(data) private(i)
    for(i=0; i<N; i++) {
        data[i] = i*4 % N;
    }

    #pragma omp parallel shared(max) private(localmax, i)
    {
        localmax = data[0];
        #pragma omp for
        for(i=0; i<N; i++) {
            if(data[i] > localmax) {
                localmax = data[i];
            }
        }
        #pragma omp critical
        {
            if(localmax > max) {
                max = localmax;
            }
        }
    }

    cout << "The maximum is " << max << endl;

    return 0;
}
