interface Counter {
    command void increment();
    event void getValue(uint8_t value);

    command void start();
    command void stop();
}
