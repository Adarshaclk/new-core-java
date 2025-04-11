package com.java.inherMtd.internal;

class Tube {
    protected Tube() {
        System.out.println("running inside the Tube CONST");
    }

    public void squeeze() {
        System.out.println("running inside the squeeze method");
    }
}
