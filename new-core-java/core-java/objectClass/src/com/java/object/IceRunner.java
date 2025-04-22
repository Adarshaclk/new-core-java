package com.java.object;

public class IceRunner
{
    public static void main(String[] args) {

        Ice i1 = new Ice("Cube", -5.0, 0.25, true);
        Ice i2 = new Ice("Crushed", -7.0, 0.30, false);
        Ice i3 = new Ice("Crushed", -7.0, 0.30, false);

        System.out.println("Ice 1: " + i1);
        System.out.println("Ice 2: " + i2);
        System.out.println("Ice 3: " + i3);

        boolean iMatch = i2.equals(i3);
        boolean iNotMatch = i1.equals(i2);
        System.out.println("Ice match: " + iMatch);
        System.out.println("Ice not match: " + iNotMatch);
    }
}
