package com.java.object;
import java.util.Objects;
public class Ice {

    private String shape;
    private double temperature;
    private double weight;
    private boolean isTransparent;

    public Ice(String shape, double temperature, double weight, boolean isTransparent) {
        this.shape = shape;
        this.temperature = temperature;
        this.weight = weight;
        this.isTransparent = isTransparent;
    }

    @Override
    public String toString() {
        return "Ice{" +
                "shape='" + shape + ", temperature=" + temperature + ", weight=" + weight + ", isTransparent=" + isTransparent + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Ice) {
            Ice other = (Ice) obj;
            if (Objects.equals(this.shape, other.shape) &&
                    this.isTransparent == other.isTransparent) {
                System.out.println("Ice is matching..");
                return true;
            }
        }
        return false;
    }
}
