package com.java.object;

public class PaperRunner
{
    public static void main(String[] args) {

        Paper p1 = new Paper("Glossy", "White", 120.0, false);
        Paper p2 = new Paper("Matte", "Cream", 100.0, true);
        Paper p3 = new Paper("Matte", "Cream", 100.0, true);

        System.out.println("Paper 1: " + p1);
        System.out.println("Paper 2: " + p2);
        System.out.println("Paper 3: " + p3);

        boolean pMatch = p2.equals(p3);
        boolean pNotMatch = p1.equals(p2);
        System.out.println("Paper match: " + pMatch);
        System.out.println("Paper not match: " + pNotMatch);
    }
}
