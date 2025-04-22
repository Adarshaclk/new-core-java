package com.java.object;

public class CarChiefRunner
{
    public static void main(String[] args) {

        CarChief c1 = new CarChief("John", 15, "Engine Specialist", true);
        CarChief c2 = new CarChief("Mike", 10, "Transmission Specialist", false);
        CarChief c3 = new CarChief("Mike", 10, "Transmission Specialist", false);

        System.out.println("CarChief 1: " + c1);
        System.out.println("CarChief 2: " + c2);
        System.out.println("CarChief 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("CarChief match: " + cMatch);
        System.out.println("CarChief not match: " + cNotMatch);
    }
}
