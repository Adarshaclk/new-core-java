package com.java.object;
import java.util.Objects;
public class Rose {

    private String color;
    private int petalCount;
    private double height;
    private boolean hasFragrance;

    public Rose(String color, int petalCount, double height, boolean hasFragrance) {
        this.color = color;
        this.petalCount = petalCount;
        this.height = height;
        this.hasFragrance = hasFragrance;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color='" + color + ", petalCount=" + petalCount + ", height=" + height + ", hasFragrance=" + hasFragrance + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rose) {
            Rose other = (Rose) obj;
            if (Objects.equals(this.color, other.color) &&
                    this.hasFragrance == other.hasFragrance) {
                System.out.println("Rose is matching..");
                return true;
            }
        }
        return false;
    }
}
