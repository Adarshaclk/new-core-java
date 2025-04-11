package com.java.inherMtd.internal;

class Bowl {
    protected Bowl() {
        System.out.println("running inside the Bowl CONST");
    }

    public void hold() {
        System.out.println("running inside the hold method");
    }
}