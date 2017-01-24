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
            atomic {
                numPackets++;
            }
            return msg;
        }

        command error_t Read.read() {
            post readCount();
            return SUCCESS;
        }

        task void readCount() {
            atomic {
                signal readDone(SUCCESS, numPackets);
            }
        }

        command error_t Init.init() {
            // On initialization, start the timer.
            call Timer.startPeriodic(10000);
        }

        event void Timer.fired() {
            atomic {
                numPackets = 0;
            }
        }
    }
}
