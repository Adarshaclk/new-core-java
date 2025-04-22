package com.java.object;
import java.util.Objects;
public class Paper {

    private String type;
    private String color;
    private double thickness;
    private boolean isRuled;

    public Paper(String type, String color, double thickness, boolean isRuled) {
        this.type = type;
        this.color = color;
        this.thickness = thickness;
        this.isRuled = isRuled;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "type='" + type + ", color='" + color + "', thickness=" + thickness + "gsm, isRuled=" + isRuled + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Paper) {
            Paper other = (Paper) obj;
            if (Objects.equals(this.type, other.type) &&
                    Objects.equals(this.color, other.color)) {
                System.out.println("Paper is matching..");
                return true;
            }
        }
        return false;
    }
}
