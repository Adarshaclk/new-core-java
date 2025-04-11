package com.java.inherMtd.internal;

class Train {
    protected Train() {
        System.out.println("running inside the Train CONST");
    }

    public void move() {
        System.out.println("running inside the move method");
    }
}