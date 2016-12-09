#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#define NUM_THREADS 5

void * PrintHello(void *threadid) {
    printf("\n%d: Hello World!\n", *((int *)threadid));
    free(threadid);
    pthread_exit(NULL);
}

int main(int argc, char* argv[]) {
    pthread_t threads[NUM_THREADS];
    int *ids[NUM_THREADS];
    int i;

    for(i=0; i<NUM_THREADS; i++) {
        ids[i] = malloc(sizeof(int));
        *ids[i] = i;
        printf("\n%d: Creating thread!", i);
        pthread_create(&threads[i], NULL, PrintHello, ids[i]);
    }

    pthread_exit(NULL);
}
