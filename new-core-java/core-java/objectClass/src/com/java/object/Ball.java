package com.java.object;
import java.util.Objects;
public class Ball {

    private String color;
    private String material;
    private double diameter;
    private boolean isBouncy;

    public Ball(String color, String material, double diameter, boolean isBouncy) {
        this.color = color;
        this.material = material;
        this.diameter = diameter;
        this.isBouncy = isBouncy;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + ", material='" + material + "', diameter=" + diameter + "cm, isBouncy=" + isBouncy + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Ball) {
            Ball other = (Ball) obj;
            if (Objects.equals(this.color, other.color) &&
                    Objects.equals(this.material, other.material)) {
                System.out.println("Ball is matching..");
                return true;
            }
        }
        return false;
    }
}
