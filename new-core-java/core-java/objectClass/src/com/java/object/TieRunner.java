package com.java.object;

public class TieRunner
{
    public static void main(String[] args) {

        Tie t1 = new Tie("Blue", "Striped", 145.0, true);
        Tie t2 = new Tie("Red", "Plain", 150.0, false);
        Tie t3 = new Tie("Red", "Plain", 150.0, false);

        System.out.println("Tie 1: " + t1);
        System.out.println("Tie 2: " + t2);
        System.out.println("Tie 3: " + t3);

        boolean tMatch = t2.equals(t3);
        boolean tNotMatch = t1.equals(t2);
        System.out.println("Tie match: " + tMatch);
        System.out.println("Tie not match: " + tNotMatch);
    }
}
