#include <iostream>
#include <omp.h>

using namespace std;

int main(int argc, char *argv[]) {

    #pragma omp parallel
    {
        cout << "Hello world" << endl;
    }

    return 0;
}
