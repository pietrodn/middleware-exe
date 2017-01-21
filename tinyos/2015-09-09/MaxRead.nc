module MaxRead {
    uses {
        interface Read<uint16_t> as Sensor;
        interface Timer<TMilli>;
    }
    provides {
        interface Read<uint16_t>;
    }

    implementation {
        uint16_t maxVal = 0;
        uint8_t nReadings = 0;

        command error_t read() {
            nReadings = 0;
            maxVal = 0;

            // Initiate the first reading
            call Sensor.read();
            return SUCCESS;
        }

        event void Timer.fired() {
            call Sensor.read();
        }

        event void Sensor.readDone(error_t err, uint16_t val) {
            nReadings++;
            if(val > maxVal) {
                maxVal = val;
            }

            if(nReadings < 10) {
                call Timer.startOneShot(20); // request another reading
            } else {
                signal readDone(SUCCESS, maxVal); // communicate the max value
            }
        }
    }
}
