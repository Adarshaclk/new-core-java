package com.java.object;

public class CatRunner
{
    public static void main(String[] args) {

        Cat c1 = new Cat("Milo", "Persian", 3, true);
        Cat c2 = new Cat("Luna", "Siamese", 2, false);
        Cat c3 = new Cat("Luna", "Siamese", 2, false);

        System.out.println("Cat 1: " + c1);
        System.out.println("Cat 2: " + c2);
        System.out.println("Cat 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Cat match: " + cMatch);
        System.out.println("Cat not match: " + cNotMatch);
    }
}
