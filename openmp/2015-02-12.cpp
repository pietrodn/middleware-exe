#include <iostream>
#include <cstdio>
#include <omp.h>

using namespace std;

int main(int argc, char *argv[]) {

    const int ROWS = 10;
    const int LINES = 5;

    int M[ROWS][LINES];
    double N[ROWS][LINES];
    int i, sum=0;
    double avgM;

    // Fill in the matrix
    #pragma omp parallel for
    for(i=0; i<ROWS*LINES; i++) {
        M[i/LINES][i%LINES] = (i/LINES) + (i%LINES);
    }

    cout << "Matrix M:" << endl;
    for(i=0; i<ROWS; i++) {
        for(int j=0; j<LINES; j++) {
            printf("%d\t", M[i][j]);
        }
        cout << endl;
    }

    #pragma omp parallel for reduction(+: sum)
    for(i=0; i<ROWS*LINES; i++) {
        sum += M[i/LINES][i%LINES];
    }

    avgM = sum / (ROWS*LINES);

    #pragma omp parallel for
    for(i=0; i<ROWS*LINES; i++) {
        N[i/LINES][i%LINES] = M[i/LINES][i%LINES] - avgM;
    }

    cout << "Matrix N:" << endl;
    for(i=0; i<ROWS; i++) {
        for(int j=0; j<LINES; j++) {
            printf("%.2f\t", N[i][j]);
        }
        cout << endl;
    }

    return 0;
}
