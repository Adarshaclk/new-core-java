package com.java.object;
import java.util.Objects;
public class Biriyani {

    private String style;
    private String meatType;
    private double price;
    private boolean isSpicy;

    public Biriyani(String style, String meatType, double price, boolean isSpicy) {
        this.style = style;
        this.meatType = meatType;
        this.price = price;
        this.isSpicy = isSpicy;
    }

    @Override
    public String toString() {
        return "Biriyani{" +
                "style='" + style + ", meatType='" + meatType + "', price=" + price + ", isSpicy=" + isSpicy + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Biriyani) {
            Biriyani other = (Biriyani) obj;
            if (Objects.equals(this.style, other.style) &&
                    Objects.equals(this.meatType, other.meatType)) {
                System.out.println("Biriyani is matching..");
                return true;
            }
        }
        return false;
    }
}
