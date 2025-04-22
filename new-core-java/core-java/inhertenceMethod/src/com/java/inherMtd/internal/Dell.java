package com.java.inherMtd.internal;

public class Dell {
    private String model;
    private double screenSize;

    public Dell(String model, double screenSize) {
        System.out.println("running inside the Dell CONST");
        this.model = model;
        this.screenSize = screenSize;
    }

    public void dell() {
        System.out.println("running inside the dell method");
    }

    @Override
    public String toString() {
        return "Dell{" + "model='" + model + '\'' + ", screenSize=" + screenSize + '}';
    }
}
