package com.java.inherMtd.internal;

class Blanket {
    private String material;
    private int price;

    protected Blanket(String material, int price) {
        System.out.println("running inside the Blanket CONST");
        this.material = material;
        this.price = price;
    }

    void setBlanket(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public void cover() {
        System.out.println("running inside the cover method");
    }

    @Override
    public String toString() {
        return "Blanket{" + "material='" + material + '\'' + ", price=" + price + '}';
    }
}
