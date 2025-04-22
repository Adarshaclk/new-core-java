package com.java.object;

public class WatchRunner
{
    public static void main(String[] args) {

        Watch w1 = new Watch("Rolex", "Analog", true, 5000.99);
        Watch w2 = new Watch("Casio", "Digital", true, 99.99);
        Watch w3 = new Watch("Casio", "Digital", true, 99.99);

        System.out.println("Watch 1: " + w1);
        System.out.println("Watch 2: " + w2);
        System.out.println("Watch 3: " + w3);

        boolean wMatch = w2.equals(w3);
        boolean wNotMatch = w1.equals(w2);
        System.out.println("Watch match: " + wMatch);
        System.out.println("Watch not match: " + wNotMatch);



    }
}
