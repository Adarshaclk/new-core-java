package com.java.exception.rating;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter your rating:");
            int n = scanner.nextInt();

            if (n >= 1 && n <= 5) {
                System.out.println("Your rating: " + n);
            } else {
                System.out.println(" Error: Rating must be between 1 and 5.");
            }

        } catch (InputMismatchException e) {
            System.out.println(" Error: Invalid input. Please enter an integer between 1 and 5.");
        } finally {
            scanner.close();
        }
    }
}
