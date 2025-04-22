package com.java.object;
import java.util.Objects;
public class Cement {

    private String brand;
    private double weight;
    private String grade;
    private double price;

    public Cement(String brand, double weight, String grade, double price) {
        this.brand = brand;
        this.weight = weight;
        this.grade = grade;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cement{" +
                "brand='" + brand + ", weight=" + weight + ", grade='" + grade + "', price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cement) {
            Cement other = (Cement) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.grade, other.grade)) {
                System.out.println("Cement is matching..");
                return true;
            }
        }
        return false;
    }
}
