package com.java.object;

public class AsiaRunner
{
    public static void main(String[] args) {

        Asia a1 = new Asia("China", 44579000.0, 460000000, true);
        Asia a2 = new Asia("India", 3287000.0, 1400000000, true);
        Asia a3 = new Asia("India", 3287000.0, 1400000000, true);

        System.out.println("Asia 1: " + a1);
        System.out.println("Asia 2: " + a2);
        System.out.println("Asia 3: " + a3);

        boolean aMatch = a2.equals(a3);
        boolean aNotMatch = a1.equals(a2);
        System.out.println("Asia match: " + aMatch);
        System.out.println("Asia not match: " + aNotMatch);
    }
}
