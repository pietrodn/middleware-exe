module CounterImpl {
    uses {
        interface Timer<TMilli>; // reset timer
    }
    provides {
        interface Counter;
    }

    implementation {
        uint8_t count = 0;

        command void start() {
            call Timer.startPeriodic(10000);
        }

        command void stop() {
            call timer.stop();
        }

        event Timer.fired() {
            count = 0;
        }

        command void increment() {
            count++;
            if(count == 100) {
                signal getValue(count);
            }
        }
    }
}
