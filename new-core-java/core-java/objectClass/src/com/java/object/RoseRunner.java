package com.java.object;

public class RoseRunner
{
    public static void main(String[] args) {

        Rose r1 = new Rose("Red", 32, 1.2, true);
        Rose r2 = new Rose("White", 28, 1.0, false);
        Rose r3 = new Rose("White", 28, 1.0, false);

        System.out.println("Rose 1: " + r1);
        System.out.println("Rose 2: " + r2);
        System.out.println("Rose 3: " + r3);

        boolean rMatch = r2.equals(r3);
        boolean rNotMatch = r1.equals(r2);
        System.out.println("Rose match: " + rMatch);
        System.out.println("Rose not match: " + rNotMatch);
    }
}
