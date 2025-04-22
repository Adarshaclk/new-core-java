package com.java.object;

public class BagRunner
 {
    public static void main(String[] args) {

        Bag b1 = new Bag("polister", 1000, true, "american");
        Bag b2 = new Bag("coton", 1500, false, "skybags");
        Bag b3 = new Bag("coton", 1500, false, "skybags");

        System.out.println("Bag 1: " + b1);
        System.out.println("Bag 2: " + b2);
        System.out.println("Bag 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Bag match: " + bMatch);
        System.out.println("Bag not match: " + bNotMatch);



    }
}
