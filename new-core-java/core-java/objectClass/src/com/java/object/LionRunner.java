package com.java.object;

public class LionRunner
{
    public static void main(String[] args) {

        Lion l1 = new Lion("Simba", 5, 190.5, true);
        Lion l2 = new Lion("Leo", 7, 210.0, false);
        Lion l3 = new Lion("Leo", 7, 210.0, false);

        System.out.println("Lion 1: " + l1);
        System.out.println("Lion 2: " + l2);
        System.out.println("Lion 3: " + l3);

        boolean lMatch = l2.equals(l3);
        boolean lNotMatch = l1.equals(l2);
        System.out.println("Lion match: " + lMatch);
        System.out.println("Lion not match: " + lNotMatch);
    }
}
