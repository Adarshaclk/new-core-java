package com.java.object;
import java.util.Objects;
public class Keyboard {

    private String brand;
    private String type;
    private boolean isWireless;
    private double price;

    public Keyboard(String brand, String type, boolean isWireless, double price) {
        this.brand = brand;
        this.type = type;
        this.isWireless = isWireless;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + ", type='" + type + "', isWireless=" + isWireless + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Keyboard) {
            Keyboard other = (Keyboard) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.type, other.type)) {
                System.out.println("Keyboard is matching..");
                return true;
            }
        }
        return false;
    }
}
