package com.java.inherMtd.internal;

class Tube {
    private String brand;
    private int price;

    protected Tube(String brand, int price) {
        System.out.println("running inside the Tube CONST");
        this.brand = brand;
        this.price = price;
    }

    void setTube(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void squeeze() {
        System.out.println("running inside the squeeze method");
    }

    @Override
    public String toString() {
        return "Tube{" + "brand='" + brand + '\'' + ", price=" + price + '}';
    }
}
