package com.java.inherMtd.internal;

class Elevator {
    protected Elevator() {
        System.out.println("running inside the Elevator CONST");
    }

    public void move() {
        System.out.println("running inside the move method");
    }
}
