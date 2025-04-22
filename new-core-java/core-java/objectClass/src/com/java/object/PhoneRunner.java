package com.java.object;

public class PhoneRunner
{
    public static void main(String[] args) {

        Phone p1 = new Phone("Apple", "iPhone 14", true, 999.99);
        Phone p2 = new Phone("Samsung", "Galaxy S22", true, 799.99);
        Phone p3 = new Phone("Samsung", "Galaxy S22", true, 799.99);

        System.out.println("Phone 1: " + p1);
        System.out.println("Phone 2: " + p2);
        System.out.println("Phone 3: " + p3);

        boolean pMatch = p2.equals(p3);
        boolean pNotMatch = p1.equals(p2);
        System.out.println("Phone match: " + pMatch);
        System.out.println("Phone not match: " + pNotMatch);
    }
}
