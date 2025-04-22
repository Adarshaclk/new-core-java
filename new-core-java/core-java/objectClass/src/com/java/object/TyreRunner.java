package com.java.object;

public class TyreRunner
{
    public static void main(String[] args) {

        Tyre t1 = new Tyre("MRF", 16.5, 'R', 3500.75);
        Tyre t2 = new Tyre("Apollo", 14.0, 'T', 2800.50);
        Tyre t3 = new Tyre("Apollo", 14.0, 'T', 2800.50);

        System.out.println("Tyre 1: " + t1);
        System.out.println("Tyre 2: " + t2);
        System.out.println("Tyre 3: " + t3);

        boolean tMatch = t2.equals(t3);
        boolean tNotMatch = t1.equals(t2);
        System.out.println("Tyre match: " + tMatch);
        System.out.println("Tyre not match: " + tNotMatch);
    }
}
