package com.java.object;

public class ChairRunner
{
    public static void main(String[] args) {

        Chair c1 = new Chair("recliner", 12000L, true, "leather");
        Chair c2 = new Chair("dining", 8000L, false, "wood");
        Chair c3 = new Chair("dining", 8000L, false, "wood");

        System.out.println("Chair 1: " + c1);
        System.out.println("Chair 2: " + c2);
        System.out.println("Chair 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Chair match: " + cMatch);
        System.out.println("Chair not match: " + cNotMatch);



    }
}
