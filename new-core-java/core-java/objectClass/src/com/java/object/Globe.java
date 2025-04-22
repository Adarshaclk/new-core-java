package com.java.object;
import java.util.Objects;
public class Globe {

    private String brand;
    private double diameter;
    private String language;
    private boolean isIlluminated;

    public Globe(String brand, double diameter, String language, boolean isIlluminated) {
        this.brand = brand;
        this.diameter = diameter;
        this.language = language;
        this.isIlluminated = isIlluminated;
    }

    @Override
    public String toString() {
        return "Globe{" +
                "brand='" + brand + ", diameter=" + diameter + "cm, language='" + language + "', isIlluminated=" + isIlluminated + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Globe) {
            Globe other = (Globe) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.language, other.language)) {
                System.out.println("Globe is matching..");
                return true;
            }
        }
        return false;
    }
}
