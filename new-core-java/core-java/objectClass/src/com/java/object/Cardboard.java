package com.java.object;
import java.util.Objects;
public class Cardboard {

    private String size;
    private String color;
    private double thickness;
    private boolean isRecyclable;

    public Cardboard(String size, String color, double thickness, boolean isRecyclable) {
        this.size = size;
        this.color = color;
        this.thickness = thickness;
        this.isRecyclable = isRecyclable;
    }

    @Override
    public String toString() {
        return "Cardboard{" +
                "size='" + size + ", color='" + color + "', thickness=" + thickness + "mm, isRecyclable=" + isRecyclable + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cardboard) {
            Cardboard other = (Cardboard) obj;
            if (Objects.equals(this.size, other.size) &&
                    Objects.equals(this.color, other.color)) {
                System.out.println("Cardboard is matching..");
                return true;
            }
        }
        return false;
    }
}
