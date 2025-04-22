package com.java.object;

public class TowelRunner
{
    public static void main(String[] args) {

        Towel t1 = new Towel("Cotton", "White", 150.0, true);
        Towel t2 = new Towel("Microfiber", "Blue", 120.0, false);
        Towel t3 = new Towel("Microfiber", "Blue", 120.0, false);

        System.out.println("Towel 1: " + t1);
        System.out.println("Towel 2: " + t2);
        System.out.println("Towel 3: " + t3);

        boolean tMatch = t2.equals(t3);
        boolean tNotMatch = t1.equals(t2);
        System.out.println("Towel match: " + tMatch);
        System.out.println("Towel not match: " + tNotMatch);
    }
}
