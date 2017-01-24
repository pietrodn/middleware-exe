module PacketFilter {
    uses {
        interface Receive as Rx;
    }
    provides {
        interface Receive as Tx;
        interface Read<uint16_t>;
    }

    implementation {
        uint16_t dropped = 0;

        event message_t* Rx.receive(message_t* msg, void* payload, uint8_t len) {
            if(((char*)payload)[0] == 255) { // check the first byte
                // should copy msg before passing it to the signal
                // how to do it? malloc is not recommended
                signal Tx.receive(msg, payload, len);
            } else {
                dropped++;
            }
            return msg;
        }

        command error_t read() {
            post readDropped();
            return SUCCESS;
        }

        task void readDropped() {
            signal Read.readDone(SUCCESS, dropped);
        }
    }
}
