package com.java.inherMtd.internal;

public class Bangle {
    private String material;
    private double size;

    protected Bangle(String material, double size) {
        System.out.println("running inside the Bangle CONST");
        this.material = material;
        this.size = size;
    }

    public void wear() {
        System.out.println("running inside the wear method");
    }

    @Override
    public String toString() {
        return "Bangle{" + "material='" + material + '\'' + ", size=" + size + '}';
    }
}
