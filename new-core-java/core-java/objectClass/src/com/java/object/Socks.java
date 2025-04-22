package com.java.object;
import java.util.Objects;
public class Socks {

    private String brand;
    private String color;
    private char size;
    private double price;

    public Socks(String brand, String color, char size, double price) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Socks{" +
                "brand='" + brand + ", color='" + color + "', size=" + size + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Socks) {
            Socks other = (Socks) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.color, other.color)) {
                System.out.println("Socks are matching..");
                return true;
            }
        }
        return false;
    }
}
