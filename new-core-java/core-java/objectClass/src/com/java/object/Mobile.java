package com.java.object;
import java.util.Objects;
public class Mobile {

    private String model;
    private int price;
    private boolean android;
    private String brand;

    public Mobile(String model, int price, boolean android, String brand) {
        this.model = model;
        this.price = price;
        this.android = android;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + ", price=" + price +", android=" + android + ", brand='" + brand  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mobile) {
            Mobile other = (Mobile) obj;
            if (Objects.equals(this.model, other.model) &&
                    Objects.equals(this.price, other.price)) {
                System.out.println("Mobile is matching..");
                return true;
            }
        }
        return false;
    }
}
