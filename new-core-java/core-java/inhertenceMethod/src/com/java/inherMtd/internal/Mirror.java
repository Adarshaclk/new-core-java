package com.java.inherMtd.internal;

class Mirror {
    private String shape;
    private int price;

    protected Mirror(String shape, int price) {
        System.out.println("running inside the Mirror CONST");
        this.shape = shape;
        this.price = price;
    }

    void setMirror(String shape, int price) {
        this.shape = shape;
        this.price = price;
    }

    public void reflect() {
        System.out.println("running inside the reflect method");
    }

    @Override
    public String toString() {
        return "Mirror{" + "shape='" + shape + '\'' + ", price=" + price + '}';
    }
}
