package com.java.object;
import java.util.Objects;
public class Phone {

    private String brand;
    private String model;
    private boolean is5GEnabled;
    private double price;

    public Phone(String brand, String model, boolean is5GEnabled, double price) {
        this.brand = brand;
        this.model = model;
        this.is5GEnabled = is5GEnabled;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + ", model='" + model + "', is5GEnabled=" + is5GEnabled + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Phone) {
            Phone other = (Phone) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.model, other.model)) {
                System.out.println("Phone is matching..");
                return true;
            }
        }
        return false;
    }
}
