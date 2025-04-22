package com.java.object;

public class CardboardRunner
{
    public static void main(String[] args) {

        Cardboard c1 = new Cardboard("A3", "Brown", 2.5, true);
        Cardboard c2 = new Cardboard("A4", "White", 1.5, false);
        Cardboard c3 = new Cardboard("A4", "White", 1.5, false);

        System.out.println("Cardboard 1: " + c1);
        System.out.println("Cardboard 2: " + c2);
        System.out.println("Cardboard 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Cardboard match: " + cMatch);
        System.out.println("Cardboard not match: " + cNotMatch);
    }
}
