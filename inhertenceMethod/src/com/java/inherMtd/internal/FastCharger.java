package com.java.inherMtd.internal;
class FastCharger extends Charger {
    public FastCharger() {
        System.out.println("running inside the FastCharger CONST");
    }

    public void quickCharge() {
        System.out.println("running inside the quickCharge method");
    }

    @Override
    public void plugIn() {
        System.out.println("overridden plugIn method in FastCharger");
    }
}