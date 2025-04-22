package com.java.object;
import java.util.Objects;
public class Slipper {

    private String brand;
    private String size;
    private char gender;
    private double price;

    public Slipper(String brand, String size, char gender, double price) {
        this.brand = brand;
        this.size = size;
        this.gender = gender;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Slipper{" +
                "brand='" + brand + ", size='" + size + "', gender=" + gender + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Slipper) {
            Slipper other = (Slipper) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.size, other.size)) {
                System.out.println("Slipper is matching..");
                return true;
            }
        }
        return false;
    }
}
