package com.java.inherMtd.internal;

class Wallet {
    private String brand;
    private int capacity;

    protected Wallet(String brand, int capacity) {
        System.out.println("running inside the Wallet CONST");
        this.brand = brand;
        this.capacity = capacity;
    }

    void setWallet(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public void carryCash() {
        System.out.println("running inside the carryCash method");
    }

    @Override
    public String toString() {
        return "Wallet{" + "brand='" + brand + '\'' + ", capacity=" + capacity + '}';
    }
}
