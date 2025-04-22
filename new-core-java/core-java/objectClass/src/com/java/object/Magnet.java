package com.java.object;
import java.util.Objects;
public class Magnet {

    private String shape;
    private String material;
    private double strength;
    private boolean isPermanent;

    public Magnet(String shape, String material, double strength, boolean isPermanent) {
        this.shape = shape;
        this.material = material;
        this.strength = strength;
        this.isPermanent = isPermanent;
    }

    @Override
    public String toString() {
        return "Magnet{" +
                "shape='" + shape + ", material='" + material + "', strength=" + strength + ", isPermanent=" + isPermanent + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Magnet) {
            Magnet other = (Magnet) obj;
            if (Objects.equals(this.shape, other.shape) &&
                    Objects.equals(this.material, other.material)) {
                System.out.println("Magnet is matching..");
                return true;
            }
        }
        return false;
    }
}
