package com.java.object;
import java.util.Objects;
public class Carpet {

    private String material;
    private String color;
    private double area;
    private boolean isHandmade;

    public Carpet(String material, String color, double area, boolean isHandmade) {
        this.material = material;
        this.color = color;
        this.area = area;
        this.isHandmade = isHandmade;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "material='" + material + ", color='" + color + "', area=" + area + " sq.ft, isHandmade=" + isHandmade + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Carpet) {
            Carpet other = (Carpet) obj;
            if (Objects.equals(this.material, other.material) &&
                    Objects.equals(this.color, other.color)) {
                System.out.println("Carpet is matching..");
                return true;
            }
        }
        return false;
    }
}
