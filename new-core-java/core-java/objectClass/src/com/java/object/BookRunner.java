package com.java.object;

public class BookRunner
{
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", 399.99, 250, 'A');
        Book b2 = new Book("Python Crash", 499.50, 300, 'B');
        Book b3 = new Book("Python Crash", 499.50, 300, 'B');

        System.out.println("Book 1: " + b1);
        System.out.println("Book 2: " + b2);
        System.out.println("Book 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Book match: " + bMatch);
        System.out.println("Book not match: " + bNotMatch);



    }
}
