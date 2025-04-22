package com.java.object;

public class BottleRunner
{
    public static void main(String[] args) {

        Bottle b1 = new Bottle("green", 1.5f, (short) 25, "plastic");
        Bottle b2 = new Bottle("blue", 1.0f, (short) 22, "steel");
        Bottle b3 = new Bottle("blue", 1.0f, (short) 22, "steel");

        System.out.println("Bottle 1: " + b1);
        System.out.println("Bottle 2: " + b2);
        System.out.println("Bottle 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Bottle match: " + bMatch);
        System.out.println("Bottle not match: " + bNotMatch);



    }
}
