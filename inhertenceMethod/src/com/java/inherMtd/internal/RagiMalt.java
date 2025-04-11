package com.java.inherMtd.internal;
class RagiMalt extends Ragi {
    public RagiMalt() {
        System.out.println("running inside the RagiMalt CONST");
    }

    public void drink() {
        System.out.println("running inside the drink method");
    }

    @Override
    public void grain() {
        System.out.println("overridden grain method in RagiMalt");
    }
}