package com.java.inherMtd.internal;

class Tank {
    protected Tank() {
        System.out.println("running inside the Tank CONST");
    }

    public void fire() {
        System.out.println("running inside the fire method");
    }
}