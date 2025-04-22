package com.java.inherMtd.internal;

class Charger {
    private String brand;
    private int powerOutput;

    protected Charger(String brand, int powerOutput) {
        System.out.println("running inside the Charger CONST");
        this.brand = brand;
        this.powerOutput = powerOutput;
    }

    void setCharger(String brand, int powerOutput) {
        this.brand = brand;
        this.powerOutput = powerOutput;
    }

    public void plugIn() {
        System.out.println("running inside the plugIn method");
    }

    @Override
    public String toString() {
        return "Charger{" + "brand='" + brand + '\'' + ", powerOutput=" + powerOutput + "W" + '}';
    }
}
