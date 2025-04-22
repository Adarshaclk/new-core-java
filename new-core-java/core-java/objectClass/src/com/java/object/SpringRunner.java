package com.java.object;

public class SpringRunner
{
    public static void main(String[] args) {

        Spring s1 = new Spring("Steel", 10.5, 300.0, false);
        Spring s2 = new Spring("Copper", 8.0, 150.0, true);
        Spring s3 = new Spring("Copper", 8.0, 150.0, true);

        System.out.println("Spring 1: " + s1);
        System.out.println("Spring 2: " + s2);
        System.out.println("Spring 3: " + s3);

        boolean sMatch = s2.equals(s3);
        boolean sNotMatch = s1.equals(s2);
        System.out.println("Spring match: " + sMatch);
        System.out.println("Spring not match: " + sNotMatch);
    }
}
