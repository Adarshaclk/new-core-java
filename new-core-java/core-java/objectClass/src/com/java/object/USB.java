package com.java.object;
import java.util.Objects;
public class USB {

    private String brand;
    private int capacity;
    private String type;
    private boolean isEncrypted;

    public USB(String brand, int capacity, String type, boolean isEncrypted) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.isEncrypted = isEncrypted;
    }

    @Override
    public String toString() {
        return "USB{" +
                "brand='" + brand + ", capacity=" + capacity + "GB, type='" + type + "', isEncrypted=" + isEncrypted + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof USB) {
            USB other = (USB) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    this.capacity == other.capacity) {
                System.out.println("USB is matching..");
                return true;
            }
        }
        return false;
    }
}
