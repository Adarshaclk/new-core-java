package com.java.inherMtd.internal;

class Kurtha {
    private String material;
    private int price;

    protected Kurtha(String material, int price) {
        System.out.println("running inside the Kurtha CONST");
        this.material = material;
        this.price = price;
    }

    void setKurtha(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public void wear() {
        System.out.println("running inside the wear method");
    }

    @Override
    public String toString() {
        return "Kurtha{" + "material='" + material + '\'' + ", price=" + price + '}';
    }
}
