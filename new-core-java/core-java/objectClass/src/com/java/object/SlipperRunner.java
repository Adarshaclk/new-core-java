package com.java.object;

public class SlipperRunner
{
    public static void main(String[] args) {

        Slipper s1 = new Slipper("Nike", "9", 'M', 899.99);
        Slipper s2 = new Slipper("Puma", "8", 'F', 699.50);
        Slipper s3 = new Slipper("Puma", "8", 'F', 699.50);

        System.out.println("Slipper 1: " + s1);
        System.out.println("Slipper 2: " + s2);
        System.out.println("Slipper 3: " + s3);

        boolean sMatch = s2.equals(s3);
        boolean sNotMatch = s1.equals(s2);
        System.out.println("Slipper match: " + sMatch);
        System.out.println("Slipper not match: " + sNotMatch);
    }
}
