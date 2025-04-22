package com.java.inherMtd.internal;

class Elevator {
    private String brand;
    private int capacity;

    protected Elevator(String brand, int capacity) {
        System.out.println("running inside the Elevator CONST");
        this.brand = brand;
        this.capacity = capacity;
    }

    public void move() {
        System.out.println("running inside the move method");
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
