interface PeriodicReader {
    command void start(uint32_t period);
    command void stop();
    event void read(uint16_t val);
}
