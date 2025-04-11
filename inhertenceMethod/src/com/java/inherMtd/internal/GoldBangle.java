package com.java.inherMtd.internal;
class GoldBangle extends Bangle {
    public GoldBangle() {
        System.out.println("running inside the GoldBangle CONST");
    }

    public void sparkle() {
        System.out.println("running inside the sparkle method");
    }

    @Override
    public void wear() {
        System.out.println("overridden wear method in GoldBangle");
    }
}