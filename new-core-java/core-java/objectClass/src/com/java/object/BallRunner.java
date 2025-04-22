package com.java.object;

public class BallRunner
{
    public static void main(String[] args) {

        Ball b1 = new Ball("Red", "Rubber", 7.5, true);
        Ball b2 = new Ball("Blue", "Plastic", 6.0, false);
        Ball b3 = new Ball("Blue", "Plastic", 6.0, false);

        System.out.println("Ball 1: " + b1);
        System.out.println("Ball 2: " + b2);
        System.out.println("Ball 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Ball match: " + bMatch);
        System.out.println("Ball not match: " + bNotMatch);
    }
}
