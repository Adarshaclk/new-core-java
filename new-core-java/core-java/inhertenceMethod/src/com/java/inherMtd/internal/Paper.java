package com.java.inherMtd.internal;

public class Paper {
    private String type;
    private double thickness;

    protected Paper(String type, double thickness) {
        System.out.println("running inside the Paper CONST");
        this.type = type;
        this.thickness = thickness;
    }

    public void paper() {
        System.out.println("running inside the paper method");
    }

    @Override
    public String toString() {
        return "Paper{" + "type='" + type + '\'' + ", thickness=" + thickness + '}';
    }
}
