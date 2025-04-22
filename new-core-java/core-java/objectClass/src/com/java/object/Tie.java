package com.java.object;
import java.util.Objects;
public class Tie {

    private String color;
    private String pattern;
    private double length;
    private boolean isSilk;

    public Tie(String color, String pattern, double length, boolean isSilk) {
        this.color = color;
        this.pattern = pattern;
        this.length = length;
        this.isSilk = isSilk;
    }

    @Override
    public String toString() {
        return "Tie{" +
                "color='" + color + ", pattern='" + pattern + "', length=" + length + "cm, isSilk=" + isSilk + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tie) {
            Tie other = (Tie) obj;
            if (Objects.equals(this.color, other.color) &&
                    Objects.equals(this.pattern, other.pattern)) {
                System.out.println("Tie is matching..");
                return true;
            }
        }
        return false;
    }
}
