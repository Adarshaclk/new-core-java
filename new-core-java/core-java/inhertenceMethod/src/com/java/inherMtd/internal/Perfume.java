package com.java.inherMtd.internal;

class Perfume {
    private String brand;
    private String fragrance;

    protected Perfume(String brand, String fragrance) {
        System.out.println("running inside the Perfume CONST");
        this.brand = brand;
        this.fragrance = fragrance;
    }

    void setPerfume(String brand, String fragrance) {
        this.brand = brand;
        this.fragrance = fragrance;
    }

    public void apply() {
        System.out.println("running inside the apply method");
    }

    @Override
    public String toString() {
        return "Perfume{" + "brand='" + brand + '\'' + ", fragrance='" + fragrance + '\'' + '}';
    }
}
