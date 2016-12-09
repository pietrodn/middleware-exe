#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>

#define NUM_THREADS 20

pthread_mutex_t max_mutex = PTHREAD_MUTEX_INITIALIZER;
float max_temp = -1;


void * registerTemperature(void *arg) {
    float temp = *((float*)arg);
    free(arg);

    // Begin critical section
    pthread_mutex_lock(&max_mutex);

    if(temp > max_temp) {
        printf("Server: updating maximum temperature to %.2f°C\n", temp);
        max_temp = temp;
    }

    pthread_mutex_unlock(&max_mutex);
    // End critical section

    pthread_exit(NULL);
}

int main(int argc, char *argv[]) {
    pthread_t threadids[NUM_THREADS];
    int i;
    float *temp;

    for(i=0; i<NUM_THREADS; i++) {
        temp = malloc(sizeof(float));
        *temp = random() % 30;
        printf("Client: sending temperature %.2f°C\n", *temp);
        pthread_create(&threadids[i], NULL, registerTemperature, temp);
    }

    for(i=0; i<NUM_THREADS; i++) {
        pthread_join(threadids[i], NULL);
    }

    printf("\nMaximum temperature: %.2f°C\n", max_temp);

    pthread_exit(NULL);
}
