package com.java.object;
import java.util.Objects;
public class Pen {

    private String inkColor;
    private int price;
    private boolean refillable;
    private String brand;

    public Pen(String inkColor, int price, boolean refillable, String brand) {
        this.inkColor = inkColor;
        this.price = price;
        this.refillable = refillable;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "inkColor='" + inkColor + ", price=" + price +", refillable=" + refillable + ", brand='" + brand  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pen) {
            Pen other = (Pen) obj;
            if (Objects.equals(this.inkColor, other.inkColor) &&
                    Objects.equals(this.price, other.price)) {
                System.out.println("Pen is matching..");
                return true;
            }
        }
        return false;
    }
}
