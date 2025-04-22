package com.java.inherMtd.internal;

class BislariBottle {
    private String size;
    private int price;

    protected BislariBottle(String size, int price) {
        System.out.println("running inside the Bottle CONST");
        this.size = size;
        this.price = price;
    }

    void setBottle(String size, int price) {
        this.size = size = size;
        this.price = price;
    }

    public void fill() {
        System.out.println("running inside the fill method");
    }

    @Override
    public String toString() {
        return "BislariBottle{" + "size='" + size + '\'' + ", price=" + price + '}';
    }
}
