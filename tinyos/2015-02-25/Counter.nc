interface Counter {
    event void totalMessages(uint16_t num);
    command void reset();
}
