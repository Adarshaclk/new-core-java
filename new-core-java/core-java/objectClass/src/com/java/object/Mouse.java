package com.java.object;
import java.util.Objects;
public class Mouse {

    private String brand;
    private String sensorType;
    private boolean isWireless;
    private double price;

    public Mouse(String brand, String sensorType, boolean isWireless, double price) {
        this.brand = brand;
        this.sensorType = sensorType;
        this.isWireless = isWireless;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand='" + brand + ", sensorType='" + sensorType + "', isWireless=" + isWireless + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mouse) {
            Mouse other = (Mouse) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.sensorType, other.sensorType)) {
                System.out.println("Mouse is matching..");
                return true;
            }
        }
        return false;
    }
}
