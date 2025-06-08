package com.java.exception.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the neumarator");
        int n=scanner.nextInt();
        System.out.println("enter the denominator");
        int d= scanner.nextInt();
        int result=0;
        try {
            result = n / d;
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
