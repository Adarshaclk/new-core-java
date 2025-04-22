package com.java.object;

public class RodRunner
{
    public static void main(String[] args) {

        Rod r1 = new Rod("Steel", 5.0, 0.5, 'A');
        Rod r2 = new Rod("Aluminum", 3.0, 0.3, 'B');
        Rod r3 = new Rod("Aluminum", 3.0, 0.3, 'B');

        System.out.println("Rod 1: " + r1);
        System.out.println("Rod 2: " + r2);
        System.out.println("Rod 3: " + r3);

        boolean rMatch = r2.equals(r3);
        boolean rNotMatch = r1.equals(r2);
        System.out.println("Rod match: " + rMatch);
        System.out.println("Rod not match: " + rNotMatch);
    }
}
