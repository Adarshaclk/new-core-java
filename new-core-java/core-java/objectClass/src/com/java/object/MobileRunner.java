package com.java.object;

public class MobileRunner
{
    public static void main(String[] args) {

        Mobile m1 = new Mobile("Galaxy S21", 50000, true, "Samsung");
        Mobile m2 = new Mobile("iPhone 13", 70000, false, "Apple");
        Mobile m3 = new Mobile("iPhone 13", 70000, false, "Apple");

        System.out.println("Mobile 1: " + m1);
        System.out.println("Mobile 2: " + m2);
        System.out.println("Mobile 3: " + m3);

        boolean mMatch = m2.equals(m3);
        boolean mNotMatch = m1.equals(m2);
        System.out.println("Mobile match: " + mMatch);
        System.out.println("Mobile not match: " + mNotMatch);



    }
}
