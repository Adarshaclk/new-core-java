package com.java.object;
import java.util.Objects;
public class Bottle {

    private String color;
    private float capacity;
    private short height;
    private String material;

    public Bottle(String color, float capacity, short height, String material) {
        this.color = color;
        this.capacity = capacity;
        this.height = height;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "color='" + color + ", capacity=" + capacity +", height=" + height + ", material='" + material  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bottle) {
            Bottle other = (Bottle) obj;
            if (Objects.equals(this.color, other.color) &&
                    Objects.equals(this.capacity, other.capacity)) {
                System.out.println("Bottle is matching..");
                return true;
            }
        }
        return false;
    }
}
