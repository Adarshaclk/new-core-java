package com.java.object;
import java.util.Objects;
public class Marble {

    private String color;
    private String material;
    private double diameter;
    private boolean isGlossy;

    public Marble(String color, String material, double diameter, boolean isGlossy) {
        this.color = color;
        this.material = material;
        this.diameter = diameter;
        this.isGlossy = isGlossy;
    }

    @Override
    public String toString() {
        return "Marble{" +
                "color='" + color + ", material='" + material + "', diameter=" + diameter + "cm, isGlossy=" + isGlossy + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Marble) {
            Marble other = (Marble) obj;
            if (Objects.equals(this.color, other.color) &&
                    Objects.equals(this.material, other.material)) {
                System.out.println("Marble is matching..");
                return true;
            }
        }
        return false;
    }
}
