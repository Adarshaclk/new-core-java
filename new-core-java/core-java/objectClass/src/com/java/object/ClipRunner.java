package com.java.object;

public class ClipRunner
{
    public static void main(String[] args) {

        Clip c1 = new Clip("Metal", "Round", 'L', 15.75);
        Clip c2 = new Clip("Plastic", "Square", 'M', 10.50);
        Clip c3 = new Clip("Plastic", "Square", 'M', 10.50);

        System.out.println("Clip 1: " + c1);
        System.out.println("Clip 2: " + c2);
        System.out.println("Clip 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Clip match: " + cMatch);
        System.out.println("Clip not match: " + cNotMatch);
    }
}
