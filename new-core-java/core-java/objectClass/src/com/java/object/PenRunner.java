package com.java.object;

public class PenRunner
{
    public static void main(String[] args) {

        Pen p1 = new Pen("blue", 20, true, "Reynolds");
        Pen p2 = new Pen("black", 25, false, "Cello");
        Pen p3 = new Pen("black", 25, false, "Cello");

        System.out.println("Pen 1: " + p1);
        System.out.println("Pen 2: " + p2);
        System.out.println("Pen 3: " + p3);

        boolean pMatch = p2.equals(p3);
        boolean pNotMatch = p1.equals(p2);
        System.out.println("Pen match: " + pMatch);
        System.out.println("Pen not match: " + pNotMatch);



    }
}
