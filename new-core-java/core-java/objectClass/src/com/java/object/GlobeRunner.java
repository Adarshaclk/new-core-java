package com.java.object;

public class GlobeRunner
{
    public static void main(String[] args) {

        Globe g1 = new Globe("GeoWorld", 30.0, "English", true);
        Globe g2 = new Globe("EarthSphere", 25.0, "French", false);
        Globe g3 = new Globe("EarthSphere", 25.0, "French", false);

        System.out.println("Globe 1: " + g1);
        System.out.println("Globe 2: " + g2);
        System.out.println("Globe 3: " + g3);

        boolean gMatch = g2.equals(g3);
        boolean gNotMatch = g1.equals(g2);
        System.out.println("Globe match: " + gMatch);
        System.out.println("Globe not match: " + gNotMatch);
    }
}
