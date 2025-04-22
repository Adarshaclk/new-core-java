package com.java.object;

public class CAmeraRunner
{
    public static void main(String[] args) {

        Camera c1 = new Camera("Canon EOS 5D", 30, true, 2500.99);
        Camera c2 = new Camera("Nikon D7500", 24, true, 1500.75);
        Camera c3 = new Camera("Nikon D7500", 24, true, 1500.75);

        System.out.println("Camera 1: " + c1);
        System.out.println("Camera 2: " + c2);
        System.out.println("Camera 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Camera match: " + cMatch);
        System.out.println("Camera not match: " + cNotMatch);



    }
}
