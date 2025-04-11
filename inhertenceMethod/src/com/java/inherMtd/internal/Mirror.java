package com.java.inherMtd.internal;

class Mirror {
    protected Mirror() {
        System.out.println("running inside the Mirror CONST");
    }

    public void reflect() {
        System.out.println("running inside the reflect method");
    }
}