interface PeriodicReader {
    command void start(uint32_t period);
    event void read(uint16_t val);
}
