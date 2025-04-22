package com.java.inherMtd.internal;

public class Bottle {
    private int quant;
    private String type;

    Bottle(int quant, String type) {
        this.type = type;
        this.quant = quant;
        System.out.println("running inside the Bottle");
    }

    void btl() {
        System.out.println("running inside the btl");
    }

    @Override
    public String toString() {
        return "Bottle{" + "quant=" + quant + ", type='" + type + '\'' + '}';
    }
}