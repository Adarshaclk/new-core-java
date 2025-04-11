package com.java.inherMtd.internal;
class MobileStand extends Stand {
    public MobileStand() {
        System.out.println("running inside the MobileStand CONST");
    }

    public void rotate() {
        System.out.println("running inside the rotate method");
    }

    @Override
    public void hold() {
        System.out.println("overridden hold method in MobileStand");
    }
}
