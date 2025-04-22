package com.java.object;
import java.util.Objects;
public class Clip {

    private String material;
    private String shape;
    private char size;
    private double price;

    public Clip(String material, String shape, char size, double price) {
        this.material = material;
        this.shape = shape;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clip{" +
                "material='" + material + ", shape='" + shape + "', size=" + size + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Clip) {
            Clip other = (Clip) obj;
            if (Objects.equals(this.material, other.material) &&
                    Objects.equals(this.shape, other.shape)) {
                System.out.println("Clip is matching..");
                return true;
            }
        }
        return false;
    }
}
