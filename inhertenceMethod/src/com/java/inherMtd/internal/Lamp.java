package com.java.inherMtd.internal;

class Lamp {
    protected Lamp() {
        System.out.println("running inside the Lamp CONST");
    }
    public void glow() {
        System.out.println("running inside the glow method");
    }
}
