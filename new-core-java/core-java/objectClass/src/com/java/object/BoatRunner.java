package com.java.object;

public class BoatRunner
{
    public static void main(String[] args) {

        Boat b1 = new Boat("Sea King", "Yacht", 30.5, true);
        Boat b2 = new Boat("River Glide", "Canoe", 5.5, false);
        Boat b3 = new Boat("River Glide", "Canoe", 5.5, false);

        System.out.println("Boat 1: " + b1);
        System.out.println("Boat 2: " + b2);
        System.out.println("Boat 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Boat match: " + bMatch);
        System.out.println("Boat not match: " + bNotMatch);
    }
}
