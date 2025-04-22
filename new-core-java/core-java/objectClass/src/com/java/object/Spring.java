package com.java.object;
import java.util.Objects;
public class Spring {

    private String material;
    private double length;
    private double stiffness;
    private boolean isCompressed;

    public Spring(String material, double length, double stiffness, boolean isCompressed) {
        this.material = material;
        this.length = length;
        this.stiffness = stiffness;
        this.isCompressed = isCompressed;
    }

    @Override
    public String toString() {
        return "Spring{" +
                "material='" + material + ", length=" + length + "cm, stiffness=" + stiffness + "N/m, isCompressed=" + isCompressed + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Spring) {
            Spring other = (Spring) obj;
            if (Objects.equals(this.material, other.material) &&
                    this.stiffness == other.stiffness) {
                System.out.println("Spring is matching..");
                return true;
            }
        }
        return false;
    }
}
