package com.java.object;
import java.util.Objects;
public class Belt {

    private String brand;
    private String color;
    private double length;
    private boolean isLeather;

    public Belt(String brand, String color, double length, boolean isLeather) {
        this.brand = brand;
        this.color = color;
        this.length = length;
        this.isLeather = isLeather;
    }

    @Override
    public String toString() {
        return "Belt{" +
                "brand='" + brand + ", color='" + color + "', length=" + length + " cm, isLeather=" + isLeather + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Belt) {
            Belt other = (Belt) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.color, other.color)) {
                System.out.println("Belt is matching..");
                return true;
            }
        }
        return false;
    }
}
