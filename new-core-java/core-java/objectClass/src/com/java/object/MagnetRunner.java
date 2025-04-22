package com.java.object;

public class MagnetRunner
{
    public static void main(String[] args) {

        Magnet m1 = new Magnet("Bar", "Neodymium", 500.0, true);
        Magnet m2 = new Magnet("Ring", "Ferrite", 200.0, false);
        Magnet m3 = new Magnet("Ring", "Ferrite", 200.0, false);

        System.out.println("Magnet 1: " + m1);
        System.out.println("Magnet 2: " + m2);
        System.out.println("Magnet 3: " + m3);

        boolean mMatch = m2.equals(m3);
        boolean mNotMatch = m1.equals(m2);
        System.out.println("Magnet match: " + mMatch);
        System.out.println("Magnet not match: " + mNotMatch);
    }
}
