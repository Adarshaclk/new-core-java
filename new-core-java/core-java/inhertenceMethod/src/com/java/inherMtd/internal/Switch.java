package com.java.inherMtd.internal;

class Switch {
    private String brand;
    private int price;

    protected Switch(String brand, int price) {
        System.out.println("running inside the Switch CONST");
        this.brand = brand;
        this.price = price;
    }

    void setSwitch(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void turnOn() {
        System.out.println("running inside the turnOn method");
    }

    @Override
    public String toString() {
        return "Switch{" + "brand='" + brand + '\'' + ", price=" + price + '}';
    }
}
