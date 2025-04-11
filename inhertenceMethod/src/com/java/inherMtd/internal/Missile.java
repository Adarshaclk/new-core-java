package com.java.inherMtd.internal;

class Missile {
    protected Missile() {
        System.out.println("running inside the Missile CONST");
    }

    public void launch() {
        System.out.println("running inside the launch method");
    }
}
