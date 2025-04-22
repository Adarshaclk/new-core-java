package com.java.object;
import java.util.Objects;
public class Bench {

    private String material;
    private String color;
    private int capacity;
    private double length;

    public Bench(String material, String color, int capacity, double length) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Bench{" +
                "material='" + material + ", color='" + color + "', capacity=" + capacity + ", length=" + length + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bench) {
            Bench other = (Bench) obj;
            if (Objects.equals(this.material, other.material) &&
                    Objects.equals(this.color, other.color)) {
                System.out.println("Bench is matching..");
                return true;
            }
        }
        return false;
    }
}
