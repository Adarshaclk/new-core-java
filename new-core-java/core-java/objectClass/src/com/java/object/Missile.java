package com.java.object;
import java.util.Objects;
public class Missile {

    private String name;
    private String type;
    private double range;
    private boolean isNuclear;

    public Missile(String name, String type, double range, boolean isNuclear) {
        this.name = name;
        this.type = type;
        this.range = range;
        this.isNuclear = isNuclear;
    }

    @Override
    public String toString() {
        return "Missile{" +
                "name='" + name + ", type='" + type + "', range=" + range + " km, isNuclear=" + isNuclear + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Missile) {
            Missile other = (Missile) obj;
            if (Objects.equals(this.name, other.name) &&
                    Objects.equals(this.type, other.type)) {
                System.out.println("Missile is matching..");
                return true;
            }
        }
        return false;
    }
}
