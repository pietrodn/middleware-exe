module PacketCounter {
    uses {
        interface Timer<TMilli>;
        interface Receive;
    }
    provides {
        interface Read<uint16_t>;
    }

    implementation {
        uint16_t numPackets = 0;

        event message_t* Receive.receive(message_t* msg, void* payload, uint8_t len) {
            numPackets++;
        }

        command error_t Read.read() {
            signal readDone(SUCCESS, numPackets);
            return SUCCESS;
        }

        command error_t Init.init() {
            // On initialization, start the timer.
            call Timer.startPeriodic(10000);
        }

        event void Timer.fired() {
            numPackets = 0;
        }
    }
}
