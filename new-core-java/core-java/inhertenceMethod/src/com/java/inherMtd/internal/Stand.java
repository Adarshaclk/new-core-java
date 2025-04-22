package com.java.inherMtd.internal;

class Stand {
    private String material;
    private int price;

    protected Stand(String material, int price) {
        System.out.println("running inside the Stand CONST");
        this.material = material;
        this.price = price;
    }

    void setStand(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public void hold() {
        System.out.println("running inside the hold method");
    }

    @Override
    public String toString() {
        return "Stand{" + "material='" + material + '\'' + ", price=" + price + '}';
    }
}
