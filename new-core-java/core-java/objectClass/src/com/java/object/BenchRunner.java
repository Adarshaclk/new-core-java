package com.java.object;

public class BenchRunner
{
    public static void main(String[] args) {

        Bench b1 = new Bench("Wood", "Brown", 3, 5.5);
        Bench b2 = new Bench("Metal", "Black", 4, 6.0);
        Bench b3 = new Bench("Metal", "Black", 4, 6.0);

        System.out.println("Bench 1: " + b1);
        System.out.println("Bench 2: " + b2);
        System.out.println("Bench 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Bench match: " + bMatch);
        System.out.println("Bench not match: " + bNotMatch);
    }
}
