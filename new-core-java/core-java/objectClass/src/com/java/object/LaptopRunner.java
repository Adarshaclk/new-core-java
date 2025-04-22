package com.java.object;

public class LaptopRunner
{
    public static void main(String[] args) {

        Laptop l1 = new Laptop("i5", 8, true, "Dell");
        Laptop l2 = new Laptop("i7", 16, true, "HP");
        Laptop l3 = new Laptop("i7", 16, true, "HP");

        System.out.println("Laptop 1: " + l1);
        System.out.println("Laptop 2: " + l2);
        System.out.println("Laptop 3: " + l3);

        boolean lMatch = l2.equals(l3);
        boolean lNotMatch = l1.equals(l2);
        System.out.println("Laptop match: " + lMatch);
        System.out.println("Laptop not match: " + lNotMatch);



    }
}
