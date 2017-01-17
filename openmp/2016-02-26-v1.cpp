#include <iostream>
#include <vector>
#include <omp.h>

using namespace std;

int main(int argc, char *argv[]) {

    const int N = 10000000;
    vector<double> a(N);
    int i;
    double sum = 0;

    #pragma omp parallel for
    for(i=0; i<N; i++) {
        a[i] = i*2;
    }

    #pragma omp parallel for reduction(+: sum)
    for(i=0; i<N; i++) {
        sum += a[i];
    }

    #pragma omp parallel for
    for(i=0; i<N; i++) {
        a[i] = sum/N;
    }

    cout << "The average is " << a[0] << endl;

    return 0;
}
