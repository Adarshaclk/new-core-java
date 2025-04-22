package com.java.object;
import java.util.Objects;
public class Charger {

    private String brand;
    private String type;
    private boolean isFastCharging;
    private double price;

    public Charger(String brand, String type, boolean isFastCharging, double price) {
        this.brand = brand;
        this.type = type;
        this.isFastCharging = isFastCharging;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "brand='" + brand + ", type='" + type + "', isFastCharging=" + isFastCharging + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Charger) {
            Charger other = (Charger) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.type, other.type)) {
                System.out.println("Charger is matching..");
                return true;
            }
        }
        return false;
    }
}
