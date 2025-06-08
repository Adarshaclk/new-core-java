package com.java.exception.leapBirthday;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class LeapBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthdate (format: dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate birthdate = LocalDate.parse(inputDate, formatter);
            if (birthdate.getDayOfMonth() == 29 && birthdate.getMonthValue() == 2) {
                int year = birthdate.getYear();
                if (!Year.isLeap(year)) {
                    throw new IllegalArgumentException( year + " is not a leap year. February 29 is invalid.");
                }
            }

            System.out.println("Valid birthdate: " + birthdate);

        } catch (DateTimeParseException e) {
            System.out.println(" Invalid date format: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
finally {
            scanner.close();
        }

    }
}
