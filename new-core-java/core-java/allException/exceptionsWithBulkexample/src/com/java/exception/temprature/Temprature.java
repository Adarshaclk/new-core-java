package com.java.exception.temprature;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature value:");
        String input = scanner.nextLine();

        try {
            double temp = Double.parseDouble(input);
            System.out.println("Temperature: " + temp);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature input: " + e.getMessage());
        }
        finally {
            scanner.close();
        }

    }
}
