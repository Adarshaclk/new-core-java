package com.java.object;

public class CementRunner
{
    public static void main(String[] args) {

        Cement c1 = new Cement("UltraTech", 50.0, "53 Grade", 420.00);
        Cement c2 = new Cement("ACC", 50.0, "43 Grade", 400.00);
        Cement c3 = new Cement("ACC", 50.0, "43 Grade", 400.00);

        System.out.println("Cement 1: " + c1);
        System.out.println("Cement 2: " + c2);
        System.out.println("Cement 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Cement match: " + cMatch);
        System.out.println("Cement not match: " + cNotMatch);
    }
}
