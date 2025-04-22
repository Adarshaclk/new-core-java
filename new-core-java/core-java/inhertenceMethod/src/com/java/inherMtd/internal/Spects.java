package com.java.inherMtd.internal;

class Spects {
    private String type;
    private int price;

    protected Spects(String type, int price) {
        System.out.println("running inside the Spects CONST");
        this.type = type;
        this.price = price;
    }

    void setSpects(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public void wear() {
        System.out.println("running inside the wear method");
    }

    @Override
    public String toString() {
        return "Spects{" + "type='" + type + '\'' + ", price=" + price + '}';
    }
}
