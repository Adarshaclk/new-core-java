package com.java.inherMtd.internal;

class Milk {
    protected Milk() {
        System.out.println("running inside the Milk CONST");
    }

    public void drink() {
        System.out.println("running inside the drink method");
    }
}