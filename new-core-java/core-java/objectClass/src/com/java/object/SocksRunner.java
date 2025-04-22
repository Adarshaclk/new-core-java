package com.java.object;

public class SocksRunner
{
    public static void main(String[] args) {

        Socks s1 = new Socks("Adidas", "Black", 'L', 199.99);
        Socks s2 = new Socks("Nike", "White", 'M', 249.50);
        Socks s3 = new Socks("Nike", "White", 'M', 249.50);

        System.out.println("Socks 1: " + s1);
        System.out.println("Socks 2: " + s2);
        System.out.println("Socks 3: " + s3);

        boolean sMatch = s2.equals(s3);
        boolean sNotMatch = s1.equals(s2);
        System.out.println("Socks match: " + sMatch);
        System.out.println("Socks not match: " + sNotMatch);
    }
}
