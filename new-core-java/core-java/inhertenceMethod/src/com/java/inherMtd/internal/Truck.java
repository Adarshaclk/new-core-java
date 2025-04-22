package com.java.inherMtd.internal;

class Truck {
    private int weeler;
    private String brand;
    protected Truck(int weeler,String brand) {
        this.weeler=weeler;
        this.brand=brand;
        System.out.println("running inside the Truck CONST");
    }

    public void load() {
        System.out.println("running inside the load method");
    }

    @Override
    public String toString() {
        return "Truck{" + "weeler=" + weeler + ", brand='" + brand + '\'' + '}';
    }
}