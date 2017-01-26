module FooBoo {
    uses interface Foo;
    provides interface Boo;

    implementation {
        event void Foo.event1Fired()(uint16_t data);

        event void Foo.op2Done();

        command void Boo.op3(uint8_t data);
    }
}
