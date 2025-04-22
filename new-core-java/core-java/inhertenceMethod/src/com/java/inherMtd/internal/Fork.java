package com.java.inherMtd.internal;

class Fork {
    private String type;
    private int price;

    protected Fork(String type, int price) {
        System.out.println("running inside the Fork CONST");
        this.type = type;
        this.price = price;
    }

    void setFork(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public void pick() {
        System.out.println("running inside the pick method");
    }

    @Override
    public String toString() {
        return "Fork{" + "type='" + type + '\'' + ", price=" + price + '}';
    }
}
