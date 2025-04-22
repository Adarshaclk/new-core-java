package com.java.inherMtd.internal;

class Hammer {
    private String material;
    private double weight;

    protected Hammer(String material, double weight) {
        System.out.println("running inside the Hammer CONST");
        this.material = material;
        this.weight = weight;
    }

    public void hit() {
        System.out.println("running inside the hit method");
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                '}';
    }
}
