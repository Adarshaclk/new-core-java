package com.java.inherMtd.internal;

class WaterBottle extends BislariBottle {
    public WaterBottle() {
        super("1L", 50);
        System.out.println("running inside the WaterBottle CONST");
    }

    public void drink() {
        System.out.println("running inside the drink method");
    }

    @Override
    public void fill() {
        System.out.println("overridden fill method in WaterBottle");
    }
}
