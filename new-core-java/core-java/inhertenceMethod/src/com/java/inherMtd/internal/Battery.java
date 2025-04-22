package com.java.inherMtd.internal;

class Battery {
    private int capacity;
    private String brand;
    protected Battery(int capacity,String brand) {
        System.out.println("running inside the Battery CONST");
    }

    public void power() {
        System.out.println("running inside the power method");
    }

    @Override
    public String toString() {
        return "Battery{" + "capacity=" + capacity + ", brand='" + brand + '\'' + '}';
    }
}