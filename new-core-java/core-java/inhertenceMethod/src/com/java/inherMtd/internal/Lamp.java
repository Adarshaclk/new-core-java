package com.java.inherMtd.internal;

class Lamp {
    private String type;
    private int price;

    protected Lamp(String type, int price) {
        System.out.println("running inside the Lamp CONST");
        this.type = type;
        this.price = price;
    }

    void setLamp(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public void glow() {
        System.out.println("running inside the glow method");
    }

    @Override
    public String toString() {
        return "Lamp{" + "type='" + type + '\'' + ", price=" + price + '}';
    }
}
