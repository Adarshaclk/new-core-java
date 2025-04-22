package com.java.object;

public class BatteryRunner
{
    public static void main(String[] args) {

        Battery b1 = new Battery("Duracell", 2500.0, "AA", true);
        Battery b2 = new Battery("Energizer", 1500.0, "AAA", false);
        Battery b3 = new Battery("Energizer", 1500.0, "AAA", false);

        System.out.println("Battery 1: " + b1);
        System.out.println("Battery 2: " + b2);
        System.out.println("Battery 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Battery match: " + bMatch);
        System.out.println("Battery not match: " + bNotMatch);
    }
}
