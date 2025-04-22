package com.java.object;
import java.util.Objects;
public class Tyre {

    private String brand;
    private double diameter;
    private char type;
    private double price;

    public Tyre(String brand, double diameter, char type, double price) {
        this.brand = brand;
        this.diameter = diameter;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + ", diameter=" + diameter + ", type=" + type + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tyre) {
            Tyre other = (Tyre) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    this.type == other.type) {
                System.out.println("Tyre is matching..");
                return true;
            }
        }
        return false;
    }
}
