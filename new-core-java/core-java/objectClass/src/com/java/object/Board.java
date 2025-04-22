package com.java.object;
import java.util.Objects;
public class Board {

    private String material;
    private double length;
    private String type;
    private boolean isWritable;

    public Board(String material, double length, String type, boolean isWritable) {
        this.material = material;
        this.length = length;
        this.type = type;
        this.isWritable = isWritable;
    }

    @Override
    public String toString() {
        return "Board{" +
                "material='" + material + ", length=" + length + "cm, type='" + type + "', isWritable=" + isWritable + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Board) {
            Board other = (Board) obj;
            if (Objects.equals(this.material, other.material) &&
                    Objects.equals(this.type, other.type)) {
                System.out.println("Board is matching..");
                return true;
            }
        }
        return false;
    }
}
