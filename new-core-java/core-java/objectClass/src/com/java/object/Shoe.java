package com.java.object;
import java.util.Objects;
public class Shoe {

    private String color;
    private int size;
    private boolean leather;
    private String brand;

    public Shoe(String color, int size, boolean leather, String brand) {
        this.color = color;
        this.size = size;
        this.leather = leather;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "color='" + color + ", size=" + size +", leather=" + leather + ", brand='" + brand  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shoe) {
            Shoe other = (Shoe) obj;
            if (Objects.equals(this.color, other.color) &&
                    Objects.equals(this.size, other.size)) {
                System.out.println("Shoe is matching..");
                return true;
            }
        }
        return false;
    }
}
