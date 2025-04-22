package com.java.object;
import java.util.Objects;
public class Towel {

    private String material;
    private String color;
    private double length;
    private boolean isSoft;

    public Towel(String material, String color, double length, boolean isSoft) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.isSoft = isSoft;
    }

    @Override
    public String toString() {
        return "Towel{" +
                "material='" + material + ", color='" + color + "', length=" + length + "cm, isSoft=" + isSoft + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Towel) {
            Towel other = (Towel) obj;
            if (Objects.equals(this.material, other.material) &&
                    Objects.equals(this.color, other.color)) {
                System.out.println("Towel is matching..");
                return true;
            }
        }
        return false;
    }
}
