package com.java.object;

public class FanRunner
{
    public static void main(String[] args) {

        Fan f1 = new Fan("ceiling", (byte) 3, 75.5, "Usha");
        Fan f2 = new Fan("table", (byte) 5, 60.0, "Crompton");
        Fan f3 = new Fan("table", (byte) 5, 60.0, "Crompton");

        System.out.println("Fan 1: " + f1);
        System.out.println("Fan 2: " + f2);
        System.out.println("Fan 3: " + f3);

        boolean fMatch = f2.equals(f3);
        boolean fNotMatch = f1.equals(f2);
        System.out.println("Fan match: " + fMatch);
        System.out.println("Fan not match: " + fNotMatch);



    }
}
