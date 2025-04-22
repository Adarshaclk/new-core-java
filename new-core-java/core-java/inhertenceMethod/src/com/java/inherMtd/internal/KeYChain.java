package com.java.inherMtd.internal;

class Keychain {
    private String material;
    private int price;

    protected Keychain(String material, int price) {
        System.out.println("running inside the Keychain CONST");
        this.material = material;
        this.price = price;
    }

    void setKeychain(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public void holdKeys() {
        System.out.println("running inside the holdKeys method");
    }

    @Override
    public String toString() {
        return "Keychain{" + "material='" + material + '\'' + ", price=" + price + '}';
    }
}
