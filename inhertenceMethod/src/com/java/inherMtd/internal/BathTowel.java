package com.java.inherMtd.internal;

class BathTowel extends Towel {
    public BathTowel() {
        System.out.println("running inside the BathTowel CONST");
    }

    public void absorb() {
        System.out.println("running inside the absorb method");
    }

    @Override
    public void cloth() {
        System.out.println("overridden cloth method in BathTowel");
    }
}