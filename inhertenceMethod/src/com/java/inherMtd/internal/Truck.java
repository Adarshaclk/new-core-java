package com.java.inherMtd.internal;

class Truck {
    protected Truck() {
        System.out.println("running inside the Truck CONST");
    }

    public void load() {
        System.out.println("running inside the load method");
    }
}