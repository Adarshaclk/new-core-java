package com.java.object;
import java.util.Objects;
public class Chair {

    private String style;
    private long weight;
    private boolean foldable;
    private String material;

    public Chair(String style, long weight, boolean foldable, String material) {
        this.style = style;
        this.weight = weight;
        this.foldable = foldable;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "style='" + style + ", weight=" + weight +", foldable=" + foldable + ", material='" + material  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chair) {
            Chair other = (Chair) obj;
            if (Objects.equals(this.style, other.style) &&
                    Objects.equals(this.weight, other.weight)) {
                System.out.println("Chair is matching..");
                return true;
            }
        }
        return false;
    }
}
