package com.java.inherMtd.internal;

class Hammer {
    protected Hammer() {
        System.out.println("running inside the Hammer CONST");
    }

    public void hit() {
        System.out.println("running inside the hit method");
    }
}
