module MovingAvgTemp {
    uses {
        // This reader reads the temperature from the sensor
        interface Read<float> as TempReader;

        interface Timer<TMilli>;
    }
    provides {
        interface StdControl;

        // This reader provides the temperature average (asynchronously).
        interface Read<float> as AvgReader;
    }

    implementation {
        /*
            Assumption: the reading will not be called before the first minute
            (otherwise we have inconsistent data).
        */

        float temps[60];
        uint8_t curr_sec;

        task void computeAverage() {
            uint8_t i;
            float sum = 0;
            atomic { // correct?
                for(i=0; i<60; i++) {
                    sum += temps[i];
                }
            }
            signal AvgReader.readDone(SUCCESS, sum / 60);
        }

        command error_t AvgReader.read() {
            post computeAverage();
            return SUCCESS;
        }

        command error_t start() {
            curr_sec = 0;
            call Timer.startPeriodic(1000);
            return SUCCESS;
        }

        command error_t stop() {
            call Timer.stop();
            return SUCCESS;
        }

        event void fired() {
            call TempReader.read();
        }

        event void TempReader.readDone(error_t err, float val) {
            atomic { // to avoid read-write conflicts (correct?)
                // Replace the oldest measurement
                temps[curr_sec++] = val;
            }
        }
    }
}
