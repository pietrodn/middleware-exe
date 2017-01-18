/*
    Number of prime numbers in a range from 1 to argv[1].
*/

#include <iostream>
#include <cstdlib>
#include <omp.h>
#include <sys/time.h>

using namespace std;

bool isPrime(long int x);
double cpuSecond();

int main(int argc, char *argv[]) {

    long int count = 0;

    long int maxNum = atol(argv[1]);

    double startTime = cpuSecond();

    #pragma omp parallel for reduction(+: count) schedule(dynamic, 100)
    for (long int i = 1; i <= maxNum; i++) {
        if(isPrime(i))
            count++;
    }

    double duration = cpuSecond() - startTime;

    cout << "Primes between 1 and " << maxNum << ": " << count << endl;
    cout << "It took " << duration << "s to compute it." << endl;

}

double cpuSecond() {
    struct timeval tp;
    gettimeofday(&tp, NULL);
    return (double)tp.tv_sec + (double)tp.tv_usec * 1E-06;
}

bool isPrime(long int x) {
    long int i;
    for(i=2; i<=x/2; i++) {
        if(x%i == 0) return false;
    }
    return true;
}
