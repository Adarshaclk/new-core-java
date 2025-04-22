package com.java.object;

public class ChargerRunner
{
    public static void main(String[] args) {

        Charger ch1 = new Charger("Anker", "USB-C", true, 29.99);
        Charger ch2 = new Charger("Samsung", "USB-C", true, 24.99);
        Charger ch3 = new Charger("Samsung", "USB-C", true, 24.99);

        System.out.println("Charger 1: " + ch1);
        System.out.println("Charger 2: " + ch2);
        System.out.println("Charger 3: " + ch3);

        boolean chMatch = ch2.equals(ch3);
        boolean chNotMatch = ch1.equals(ch2);
        System.out.println("Charger match: " + chMatch);
        System.out.println("Charger not match: " + chNotMatch);
    }
}
