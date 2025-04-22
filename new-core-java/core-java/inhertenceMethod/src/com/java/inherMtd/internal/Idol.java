package com.java.inherMtd.internal;

class Idol {
    private String material;
    private double height;

    protected Idol(String material, double height) {
        System.out.println("running inside the Idol CONST");
        this.material = material;
        this.height = height;
    }

    void setIdol(String material, double height) {
        this.material = material;
        this.height = height;
    }

    public void worship() {
        System.out.println("running inside the worship method");
    }

    @Override
    public String toString() {
        return "Idol{" + "material='" + material + '\'' + ", height=" + height + "ft" + '}';
    }
}
