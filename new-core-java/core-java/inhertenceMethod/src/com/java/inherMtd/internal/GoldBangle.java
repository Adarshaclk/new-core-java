package com.java.inherMtd.internal;

public class GoldBangle extends Bangle {
    public GoldBangle() {
        super("Gold", 2.5);
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
