package com.java.inherMtd.internal;

class Bat {
    private String brand;
    private double weight;

    protected Bat(String brand, double weight) {
        System.out.println("running inside the Bat CONST");
        this.brand = brand;
        this.weight = weight;
    }

    void setBat(String brand, double weight) {
        this.brand = brand;
        this.weight = weight;
    }

    public void swing() {
        System.out.println("running inside the swing method");
    }

    @Override
    public String toString() {
        return "Bat{" + "brand='" + brand + '\'' + ", weight=" + weight + "kg" + '}';
    }
}
