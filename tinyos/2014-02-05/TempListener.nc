module TempListener {
    uses {
        interface Timer<TMilli>;
        interface Read<uint16_t>;
    }
    provides {
        interface Listener;
        interface StdControl;
    }

    implementation {
        uint8_t num_reads = 0;
        uint16_t sum = 0;

        command error_t StdControl.start() {
            num_reads = 0;
            sum = 0;
            call Timer.startPeriodic(1000);
            return SUCCESS;
        }

        command error_t StdControl.stop() {
            call Timer.stop();
            return SUCCESS;
        }

        event void Listener.fired() {
            call Read.read();
        }

        event void Read.readDone(error_t result, uint16_t val) {
            num_reads = (num_reads + 1) % 10;
            sum += value;
            if(num_reads == 0) {
                signal notify(sum / 10);
                sum = 0;
            }
        }
    }
}
