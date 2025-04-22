package com.java.object;
import java.util.Objects;
public class Battery {

    private String brand;
    private double capacity;
    private String type;
    private boolean isRechargeable;

    public Battery(String brand, double capacity, String type, boolean isRechargeable) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "brand='" + brand + ", capacity=" + capacity + "mAh, type='" + type + "', isRechargeable=" + isRechargeable + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Battery) {
            Battery other = (Battery) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.type, other.type)) {
                System.out.println("Battery is matching..");
                return true;
            }
        }
        return false;
    }
}
