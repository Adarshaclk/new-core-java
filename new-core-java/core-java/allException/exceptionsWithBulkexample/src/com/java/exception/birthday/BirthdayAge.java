package com.java.exception.birthday;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BirthdayAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthdate (format: yyyy-MM-dd):");
        String input = scanner.nextLine();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = LocalDate.parse(input, formatter);
            LocalDate today = LocalDate.now();

            Period age = Period.between(birthDate, today);
            System.out.println(" Your age is: " + age.getYears() + " years");

        } catch (DateTimeParseException e) {
            System.out.println(" Invalid date format or value: " + e.getMessage());
        }
        finally {
            scanner.close();
        }

    }
}
