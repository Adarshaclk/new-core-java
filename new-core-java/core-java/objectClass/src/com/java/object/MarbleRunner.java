package com.java.object;

public class MarbleRunner
{
    public static void main(String[] args) {

        Marble m1 = new Marble("Green", "Glass", 2.5, true);
        Marble m2 = new Marble("Blue", "Stone", 3.0, false);
        Marble m3 = new Marble("Blue", "Stone", 3.0, false);

        System.out.println("Marble 1: " + m1);
        System.out.println("Marble 2: " + m2);
        System.out.println("Marble 3: " + m3);

        boolean mMatch = m2.equals(m3);
        boolean mNotMatch = m1.equals(m2);
        System.out.println("Marble match: " + mMatch);
        System.out.println("Marble not match: " + mNotMatch);
    }
}
