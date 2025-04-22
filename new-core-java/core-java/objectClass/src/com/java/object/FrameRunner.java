package com.java.object;

public class FrameRunner
{
    public static void main(String[] args) {

        Frame f1 = new Frame("Wood", 40.0, 30.0, true);
        Frame f2 = new Frame("Metal", 50.0, 35.0, false);
        Frame f3 = new Frame("Metal", 50.0, 35.0, false);

        System.out.println("Frame 1: " + f1);
        System.out.println("Frame 2: " + f2);
        System.out.println("Frame 3: " + f3);

        boolean fMatch = f2.equals(f3);
        boolean fNotMatch = f1.equals(f2);
        System.out.println("Frame match: " + fMatch);
        System.out.println("Frame not match: " + fNotMatch);
    }
}
