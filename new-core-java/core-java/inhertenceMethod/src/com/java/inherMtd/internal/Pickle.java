package com.java.inherMtd.internal;

class Pickle {
    private String type;
    private int price;

    protected Pickle(String type, int price) {
        System.out.println("running inside the Pickle CONST");
        this.type = type;
        this.price = price;
    }

    void setPickle(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public void preserve() {
        System.out.println("running inside the preserve method");
    }

    @Override
    public String toString() {
        return "Pickle{" + "type='" + type + '\'' + ", price=" + price + '}';
    }
}
