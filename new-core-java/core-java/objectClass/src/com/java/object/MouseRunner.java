package com.java.object;

public class MouseRunner
{
    public static void main(String[] args) {

        Mouse m1 = new Mouse("Logitech", "Optical", true, 2500.00);
        Mouse m2 = new Mouse("Dell", "Laser", false, 1200.00);
        Mouse m3 = new Mouse("Dell", "Laser", false, 1200.00);

        System.out.println("Mouse 1: " + m1);
        System.out.println("Mouse 2: " + m2);
        System.out.println("Mouse 3: " + m3);

        boolean mMatch = m2.equals(m3);
        boolean mNotMatch = m1.equals(m2);
        System.out.println("Mouse match: " + mMatch);
        System.out.println("Mouse not match: " + mNotMatch);
    }
}
