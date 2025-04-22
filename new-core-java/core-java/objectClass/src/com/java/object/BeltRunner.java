package com.java.object;

public class BeltRunner
{
    public static void main(String[] args) {

        Belt b1 = new Belt("Levis", "Black", 110.0, true);
        Belt b2 = new Belt("Puma", "Brown", 105.0, false);
        Belt b3 = new Belt("Puma", "Brown", 105.0, false);

        System.out.println("Belt 1: " + b1);
        System.out.println("Belt 2: " + b2);
        System.out.println("Belt 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Belt match: " + bMatch);
        System.out.println("Belt not match: " + bNotMatch);
    }
}
