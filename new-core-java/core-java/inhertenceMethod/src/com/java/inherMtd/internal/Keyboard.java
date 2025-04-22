package com.java.inherMtd.internal;

class Keyboard {
    private String brand;
    private int price;

    protected Keyboard(String brand, int price) {
        System.out.println("running inside the Keyboard CONST");
        this.brand = brand;
        this.price = price;
    }

    void setKeyboard(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void type() {
        System.out.println("running inside the type method");
    }

    @Override
    public String toString() {
        return "Keyboard{" + "brand='" + brand + '\'' + ", price=" + price + '}';
    }
}
