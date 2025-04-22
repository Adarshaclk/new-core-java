package com.java.inherMtd.internal;

class SmartSwitch extends Switch {
    public SmartSwitch() {
        super("Philips", 1200);
        System.out.println("running inside the SmartSwitch CONST");
    }

    public void schedule() {
        System.out.println("running inside the schedule method");
    }

    @Override
    public void turnOn() {
        System.out.println("overridden turnOn method in SmartSwitch");
    }
}
