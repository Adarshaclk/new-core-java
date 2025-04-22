package com.java.object;
import java.util.Objects;
public class Fridge {

    private String brand;
    private double capacity;
    private boolean inverterTechnology;
    private int starRating;

    public Fridge(String brand, double capacity, boolean inverterTechnology, int starRating) {
        this.brand = brand;
        this.capacity = capacity;
        this.inverterTechnology = inverterTechnology;
        this.starRating = starRating;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "brand='" + brand + ", capacity=" + capacity +", inverterTechnology=" + inverterTechnology + ", starRating=" + starRating  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fridge) {
            Fridge other = (Fridge) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.capacity, other.capacity)) {
                System.out.println("Fridge is matching..");
                return true;
            }
        }
        return false;
    }
}
