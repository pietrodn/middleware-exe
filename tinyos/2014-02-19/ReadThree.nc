/*
    Lots of doubts here about the use of parametrized interface.
*/

module ReadThree {
    uses {
        interface Read<uint16_t>[uint8_t num] as Sensors;
    }
    provides {
        interface Read<float> as Avg;
    }

    implementation {
        float sum = 0;
        uint8_t num_read = 0;

        command error_t Avg.read() {
            int i;
            sum = 0;
            num_read = 0;
            for(i=0; i<3; i++) {
                Sensors[i].read();
            }
            return SUCCESS;
        }

        event void Sensors[uint8_t num].readDone(error_t result, uint16_t val) {
            sum += val;
            num_read++;

            if(num_read == 3) {
                signal Avg.readDone(SUCCESS, sum/3);
            }
        }
    }
}
