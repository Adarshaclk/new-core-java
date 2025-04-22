package com.java.object;
import java.util.Objects;
public class Projector {

    private String brand;
    private String resolution;
    private int lumens;
    private boolean isPortable;

    public Projector(String brand, String resolution, int lumens, boolean isPortable) {
        this.brand = brand;
        this.resolution = resolution;
        this.lumens = lumens;
        this.isPortable = isPortable;
    }

    @Override
    public String toString() {
        return "Projector{" +
                "brand='" + brand + ", resolution='" + resolution + "', lumens=" + lumens + ", isPortable=" + isPortable + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Projector) {
            Projector other = (Projector) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.resolution, other.resolution)) {
                System.out.println("Projector is matching..");
                return true;
            }
        }
        return false;
    }
}
