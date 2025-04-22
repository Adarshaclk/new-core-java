package com.java.inherMtd.internal;

class Spoon {
    private String material;
    private int price;

    protected Spoon(String material, int price) {
        System.out.println("running inside the Spoon CONST");
        this.material = material;
        this.price = price;
    }

    void setSpoon(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public void scoop() {
        System.out.println("running inside the scoop method");
    }

    @Override
    public String toString() {
        return "Spoon{" + "material='" + material + '\'' + ", price=" + price + '}';
    }
}
