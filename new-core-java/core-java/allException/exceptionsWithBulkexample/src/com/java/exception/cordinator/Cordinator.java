package com.java.exception.cordinator;

import java.util.Scanner;

public class Cordinator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates");
        String input = scanner.nextLine();

        try {
            String[] parts = input.split(",");
            if (parts.length != 2) {
                throw new IllegalArgumentException("Input must be in 'x,y' format.");
            }
            double x = 0;
            double y = 0;
            try {
                x = Double.parseDouble(parts[0].trim());
            } catch (NumberFormatException e) {
                System.out.println(" Invalid x-coordinate: " + parts[0]);
            }

            try {
                y = Double.parseDouble(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println(" Invalid y-coordinate: " + parts[1]);
            }

            System.out.println("Parsed Coordinates:");
            System.out.println("x ="+x);
            System.out.println("y ="+y);

        } catch (Exception e) {
            System.out.println(" Error reading coordinates: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
