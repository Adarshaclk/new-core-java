package com.java.inherMtd.internal;
class SmartSwitch extends Switch {
    public SmartSwitch() {
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
