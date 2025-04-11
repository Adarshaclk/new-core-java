package com.java.inherMtd.internal;

class Bow {
    protected Bow() {
        System.out.println("running inside the Bow CONST");
    }

    public void shoot() {
        System.out.println("running inside the shoot method");
    }
}