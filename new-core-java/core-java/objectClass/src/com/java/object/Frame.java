package com.java.object;
import java.util.Objects;
public class Frame {

    private String material;
    private double height;
    private double width;
    private boolean hasGlass;

    public Frame(String material, double height, double width, boolean hasGlass) {
        this.material = material;
        this.height = height;
        this.width = width;
        this.hasGlass = hasGlass;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "material='" + material + ", height=" + height + "cm, width=" + width + "cm, hasGlass=" + hasGlass + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Frame) {
            Frame other = (Frame) obj;
            if (Objects.equals(this.material, other.material) &&
                    this.height == other.height &&
                    this.width == other.width) {
                System.out.println("Frame is matching..");
                return true;
            }
        }
        return false;
    }
}
