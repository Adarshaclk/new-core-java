package com.java.object;

public class CarpetRunner
{
    public static void main(String[] args) {

        Carpet c1 = new Carpet("Wool", "Red", 25.0, true);
        Carpet c2 = new Carpet("Silk", "Blue", 15.0, false);
        Carpet c3 = new Carpet("Silk", "Blue", 15.0, false);

        System.out.println("Carpet 1: " + c1);
        System.out.println("Carpet 2: " + c2);
        System.out.println("Carpet 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Carpet match: " + cMatch);
        System.out.println("Carpet not match: " + cNotMatch);
    }
}
