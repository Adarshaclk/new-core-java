package com.java.object;

public class BudsRunner
{
    public static void main(String[] args) {

        Buds b1 = new Buds("Sony", "In-ear", 8.0, true);
        Buds b2 = new Buds("JBL", "Over-ear", 10.0, false);
        Buds b3 = new Buds("JBL", "Over-ear", 10.0, false);

        System.out.println("Buds 1: " + b1);
        System.out.println("Buds 2: " + b2);
        System.out.println("Buds 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Buds match: " + bMatch);
        System.out.println("Buds not match: " + bNotMatch);
    }
}
