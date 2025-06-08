package com.java.exception.dateParser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (format: dd-MM-yyyy): ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate date = LocalDate.parse(input, formatter);
            System.out.println(" Parsed date: " + date);
        } catch (DateTimeParseException e) {
            System.out.println(" Invalid date format or value: " + e.getMessage());
        }
finally {
            scanner.close();
        }

    }
}
