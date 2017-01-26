/*
    Write in TinyOS the interface of a module to publish data (8 bit integer numbers) and to subscribe (i.e., be notified), when a specific value has been published.
*/

interface PublishSubscribe {
    // Subscribe to a specific value
    command void subscribe(uint8_t val);

    // Get notified of a value
    event void notifyValue(uint8_t val);
}
