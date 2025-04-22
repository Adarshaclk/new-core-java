package com.java.inherMtd.internal;

class Xerox {
    private String brand;
    private int price;

    protected Xerox(String brand, int price) {
        System.out.println("running inside the Xerox CONST");
        this.brand = brand;
        this.price = price;
    }

    void setXerox(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void copy() {
        System.out.println("running inside the copy method");
    }

    @Override
    public String toString() {
        return "Xerox{" + "brand='" + brand + '\'' + ", price=" + price + '}';
    }
}
