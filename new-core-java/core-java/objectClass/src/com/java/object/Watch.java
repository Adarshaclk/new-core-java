package com.java.object;
import java.util.Objects;
public class Watch {

    private String brand;
    private String type;
    private boolean isWaterResistant;
    private double price;

    public Watch(String brand, String type, boolean isWaterResistant, double price) {
        this.brand = brand;
        this.type = type;
        this.isWaterResistant = isWaterResistant;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "brand='" + brand + ", type='" + type + "', isWaterResistant=" + isWaterResistant + ", price=" + price  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Watch) {
            Watch other = (Watch) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.type, other.type)) {
                System.out.println("Watch is matching..");
                return true;
            }
        }
        return false;
    }
}
