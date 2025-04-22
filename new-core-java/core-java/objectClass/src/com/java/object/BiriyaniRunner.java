package com.java.object;

public class BiriyaniRunner
{
    public static void main(String[] args) {

        Biriyani b1 = new Biriyani("Hyderabadi", "Chicken", 350.0, true);
        Biriyani b2 = new Biriyani("Kolkata", "Mutton", 450.0, false);
        Biriyani b3 = new Biriyani("Kolkata", "Mutton", 450.0, false);

        System.out.println("Biriyani 1: " + b1);
        System.out.println("Biriyani 2: " + b2);
        System.out.println("Biriyani 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Biriyani match: " + bMatch);
        System.out.println("Biriyani not match: " + bNotMatch);
    }
}
