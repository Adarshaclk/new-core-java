package com.java.object;
import java.util.Objects;
public class Boat {

    private String name;
    private String type;
    private double length;
    private boolean isMotorized;

    public Boat(String name, String type, double length, boolean isMotorized) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.isMotorized = isMotorized;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + ", type='" + type + "', length=" + length + ", isMotorized=" + isMotorized + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Boat) {
            Boat other = (Boat) obj;
            if (Objects.equals(this.name, other.name) &&
                    Objects.equals(this.type, other.type)) {
                System.out.println("Boat is matching..");
                return true;
            }
        }
        return false;
    }
}
