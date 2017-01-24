module CounterImpl {
    uses {
        interface Receive;
    }
    provides {
        interface Counter;
    }

    implementation {
        uint16_t count = 0;

        event message_t* receive(message_t* msg, void* payload, uint8_t len) {
            count++;
            if(count % 10 == 0) {
                signal totalMessages(count);
            }
            return msg;
        }

        command void reset() {
            count = 0;
        }
    }
}
