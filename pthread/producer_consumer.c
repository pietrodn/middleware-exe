#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#define MAX_ITER 10
#define NUM_CONS 5
#define BUFFER_INCREMENT 5

// Global variables
int buffer;
pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
pthread_cond_t prod_cond = PTHREAD_COND_INITIALIZER;
pthread_cond_t cons_cond = PTHREAD_COND_INITIALIZER;

void * producer(void *arg) {
    int i;

    for(i=0; i < MAX_ITER; i++) {
        pthread_mutex_lock(&mutex);
        while(buffer > 0) {
            pthread_cond_wait(&prod_cond, &mutex);
        }
        buffer += 5;
        printf("Producer: buffer = %d\n", buffer);
        pthread_cond_broadcast(&cons_cond);
        pthread_mutex_unlock(&mutex);
        usleep(0.5E6);
    }
    pthread_exit(NULL);
}

void * consumer(void *arg) {
    int i, id;
    id = *((int *)arg);
    free(arg);

    for(i=0; i < MAX_ITER * BUFFER_INCREMENT / NUM_CONS; i++) {
        pthread_mutex_lock(&mutex);
        while(buffer <= 0) {
            pthread_cond_wait(&cons_cond, &mutex);
        }
        buffer--;
        printf("Consumer %d: buffer = %d\n", id, buffer);
        pthread_cond_broadcast(&prod_cond);
        pthread_mutex_unlock(&mutex);
        usleep(0.5E6);
    }

    pthread_exit(NULL);
}


int main(int argc, char *argv[]) {
    pthread_t thr_prod, thr_cons[NUM_CONS];
    int i, *id;

    // Init buffer
    buffer = 0;

    // Spawn producer
    pthread_create(&thr_prod, NULL, producer, NULL);

    // Spawn consumers
    for(i=0; i<NUM_CONS; i++) {
        id = malloc(sizeof(int));
        *id = i;
        pthread_create(&thr_cons[i], NULL, consumer, id);
    }

    pthread_exit(NULL);
}
