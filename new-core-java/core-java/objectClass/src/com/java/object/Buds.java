package com.java.object;
import java.util.Objects;
public class Buds {

    private String brand;
    private String type;
    private double batteryLife;
    private boolean isWireless;

    public Buds(String brand, String type, double batteryLife, boolean isWireless) {
        this.brand = brand;
        this.type = type;
        this.batteryLife = batteryLife;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return "Buds{" +
                "brand='" + brand + ", type='" + type + "', batteryLife=" + batteryLife + " hrs, isWireless=" + isWireless + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Buds) {
            Buds other = (Buds) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.type, other.type)) {
                System.out.println("Buds are matching..");
                return true;
            }
        }
        return false;
    }
}
