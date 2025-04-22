package com.java.inherMtd.internal;

class Printer {
    private String model;
    private int price;

    protected Printer(String model, int price) {
        System.out.println("running inside the Printer CONST");
        this.model = model;
        this.price = price;
    }

    void setPrinter(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void print() {
        System.out.println("running inside the print method");
    }

    @Override
    public String toString() {
        return "Printer{" + "model='" + model + '\'' + ", price=" + price + '}';
    }
}
