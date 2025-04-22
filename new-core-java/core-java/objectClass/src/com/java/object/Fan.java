package com.java.object;
import java.util.Objects;
public class Fan {

    private String type;
    private byte speedLevels;
    private double power;
    private String brand;

    public Fan(String type, byte speedLevels, double power, String brand) {
        this.type = type;
        this.speedLevels = speedLevels;
        this.power = power;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "type='" + type + ", speedLevels=" + speedLevels +", power=" + power + ", brand='" + brand  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fan) {
            Fan other = (Fan) obj;
            if (Objects.equals(this.type, other.type) &&
                    Objects.equals(this.speedLevels, other.speedLevels)) {
                System.out.println("Fan is matching..");
                return true;
            }
        }
        return false;
    }
}
