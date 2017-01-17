#include <iostream>
#include <iomanip>
#include <omp.h>

using namespace std;

int main(int argc, char *argv[]) {

    const int N = 100;

    int A[N];
    double B[N];
    int maxA;
    int i;

    #pragma omp parallel for
    for(i=0; i<N; i++) {
        A[i] = i*2;
    }

    maxA = A[0];

    #pragma omp parallel
    {
        #pragma omp single
        {
            cout << "Running with " << omp_get_num_threads() << " threads." << endl;
        }
        int max = A[0]; // init

        #pragma omp for
        for(i=0; i<N; i++) {
            max = (A[i] > max ? A[i] : max);
        }

        #pragma omp critical
        {
            maxA = (max > maxA ? max : maxA);
        }
    }

    cout << endl << "Max A: " << maxA << endl << endl;

    #pragma omp parallel for
    for(i=0; i<N; i++) {
        B[i] = (double) A[i] / maxA;
    }

    cout << "B[i]:" << endl;

    for(i=0; i<N; i++) {
        cout << setprecision (2) << B[i] << "\t";
    }

    cout << endl;

    return 0;
}
