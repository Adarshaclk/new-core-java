package com.java.object;

public class ShoeRunner
{
    public static void main(String[] args) {

        Shoe s1 = new Shoe("black", 9, true, "nike");
        Shoe s2 = new Shoe("white", 10, false, "adidas");
        Shoe s3 = new Shoe("white", 10, false, "adidas");

        System.out.println("Shoe 1: " + s1);
        System.out.println("Shoe 2: " + s2);
        System.out.println("Shoe 3: " + s3);

        boolean sMatch = s2.equals(s3);
        boolean sNotMatch = s1.equals(s2);
        System.out.println("Shoe match: " + sMatch);
        System.out.println("Shoe not match: " + sNotMatch);



    }
}
