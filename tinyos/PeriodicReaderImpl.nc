module PeriodicReader {
    uses {
        interface Read<uint16_t> as Sensor;
        interface Timer<TMilli>;
    }
    provides {
        interface PeriodicReader;
    }

    implementation {
        command void start(uint32_t period) {
            call Timer.startPeriodic(period);
        }

        event void Timer.fired() {
            Sensor.read();
        }

        event void Sensor.readDone(error_t err, uint16_t val) {
            signal PeriodicReader.read(val);
        }
    }
}
