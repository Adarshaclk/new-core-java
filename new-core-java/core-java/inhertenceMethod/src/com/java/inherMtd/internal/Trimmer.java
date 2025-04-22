package com.java.inherMtd.internal;

class Trimmer {
    private String brand;
    private int price;

    protected Trimmer(String brand, int price) {
        System.out.println("running inside the Trimmer CONST");
        this.brand = brand;
        this.price = price;
    }

    void setTrimmer(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void trim() {
        System.out.println("running inside the trim method");
    }

    @Override
    public String toString() {
        return "Trimmer{" + "brand='" + brand + '\'' + ", price=" + price + '}';
    }
}
