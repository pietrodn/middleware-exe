#include <iostream>
#include <vector>
#include <omp.h>

using namespace std;

int main(int argc, char *argv[]) {

    const int N = 10000000;
    vector<double> a(N);
    int i;
    double sum = 0, partial_sum = 0;

    #pragma omp parallel private(partial_sum), shared(sum)
    {
        #pragma omp single
        {
            cout << "Running with " << omp_get_num_threads() << " threads." << endl;
        }

        #pragma omp for
        for(i=0; i<N; i++) {
            a[i] = i*2;
        }

        #pragma omp barrier

        partial_sum = 0;
        #pragma omp for
        for(i=0; i<N; i++) {
            partial_sum += a[i];
        }

        #pragma omp critical
        {
            sum += partial_sum;
        }

        #pragma omp barrier

        #pragma omp for
        for(i=0; i<N; i++) {
            a[i] = sum/N;
        }
    }

    cout << "Sum: " << sum << endl;
    cout << "The average is " << a[0] << endl;

    return 0;
}
