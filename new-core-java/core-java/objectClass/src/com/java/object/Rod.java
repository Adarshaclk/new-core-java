package com.java.object;
import java.util.Objects;
public class Rod {

    private String material;
    private double length;
    private double thickness;
    private char grade;

    public Rod(String material, double length, double thickness, char grade) {
        this.material = material;
        this.length = length;
        this.thickness = thickness;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Rod{" +
                "material='" + material + ", length=" + length + ", thickness=" + thickness + ", grade=" + grade + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rod) {
            Rod other = (Rod) obj;
            if (Objects.equals(this.material, other.material) &&
                    this.grade == other.grade) {
                System.out.println("Rod is matching..");
                return true;
            }
        }
        return false;
    }
}
