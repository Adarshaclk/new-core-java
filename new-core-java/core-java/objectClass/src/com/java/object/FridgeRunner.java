package com.java.object;

public class FridgeRunner
{
    public static void main(String[] args) {

        Fridge f1 = new Fridge("LG", 300.5, true, 4);
        Fridge f2 = new Fridge("Samsung", 350.0, true, 5);
        Fridge f3 = new Fridge("Samsung", 350.0, true, 5);

        System.out.println("Fridge 1: " + f1);
        System.out.println("Fridge 2: " + f2);
        System.out.println("Fridge 3: " + f3);

        boolean fMatch = f2.equals(f3);
        boolean fNotMatch = f1.equals(f2);
        System.out.println("Fridge match: " + fMatch);
        System.out.println("Fridge not match: " + fNotMatch);



    }
}
