package com.java.inherMtd.internal;

class Battery {
    protected Battery() {
        System.out.println("running inside the Battery CONST");
    }

    public void power() {
        System.out.println("running inside the power method");
    }
}