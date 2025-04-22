package com.java.object;

public class AircraftRunner
{
    public static void main(String[] args) {

        Aircraft a1 = new Aircraft("A320", "Airbus", 180, true);
        Aircraft a2 = new Aircraft("737", "Boeing", 200, true);
        Aircraft a3 = new Aircraft("737", "Boeing", 200, true);

        System.out.println("Aircraft 1: " + a1);
        System.out.println("Aircraft 2: " + a2);
        System.out.println("Aircraft 3: " + a3);

        boolean aMatch = a2.equals(a3);
        boolean aNotMatch = a1.equals(a2);
        System.out.println("Aircraft match: " + aMatch);
        System.out.println("Aircraft not match: " + aNotMatch);
    }
}
