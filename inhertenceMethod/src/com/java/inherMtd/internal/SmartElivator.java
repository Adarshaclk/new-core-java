package com.java.inherMtd.internal;
class SmartElevator extends Elevator {
    public SmartElevator() {
        System.out.println("running inside the SmartElevator CONST");
    }

    public void voiceControl() {
        System.out.println("running inside the voiceControl method");
    }

    @Override
    public void move() {
        System.out.println("overridden move method in SmartElevator");
    }
}
