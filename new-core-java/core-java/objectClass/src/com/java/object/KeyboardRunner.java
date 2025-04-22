package com.java.object;

public class KeyboardRunner
{
    public static void main(String[] args) {

        Keyboard k1 = new Keyboard("Logitech", "Mechanical", true, 4999.99);
        Keyboard k2 = new Keyboard("HP", "Membrane", false, 1299.50);
        Keyboard k3 = new Keyboard("HP", "Membrane", false, 1299.50);

        System.out.println("Keyboard 1: " + k1);
        System.out.println("Keyboard 2: " + k2);
        System.out.println("Keyboard 3: " + k3);

        boolean kMatch = k2.equals(k3);
        boolean kNotMatch = k1.equals(k2);
        System.out.println("Keyboard match: " + kMatch);
        System.out.println("Keyboard not match: " + kNotMatch);
    }
}
