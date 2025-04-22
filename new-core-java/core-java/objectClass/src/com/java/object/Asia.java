package com.java.object;
import java.util.Objects;
public class Asia {

    private String largestCountry;
    private double area;
    private int population;
    private boolean isMostPopulous;

    public Asia(String largestCountry, double area, int population, boolean isMostPopulous) {
        this.largestCountry = largestCountry;
        this.area = area;
        this.population = population;
        this.isMostPopulous = isMostPopulous;
    }

    @Override
    public String toString() {
        return "Asia{" +
                "largestCountry='" + largestCountry + ", area=" + area + ", population=" + population + ", isMostPopulous=" + isMostPopulous + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Asia) {
            Asia other = (Asia) obj;
            if (Objects.equals(this.largestCountry, other.largestCountry) &&
                    this.isMostPopulous == other.isMostPopulous) {
                System.out.println("Asia is matching..");
                return true;
            }
        }
        return false;
    }
}
