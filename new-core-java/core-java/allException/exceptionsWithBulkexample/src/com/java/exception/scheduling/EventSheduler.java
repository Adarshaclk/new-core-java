package com.java.exception.scheduling;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EventSheduler {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Enter first event's end time (HH:mm):");
            LocalTime event1Start = LocalTime.parse(scanner.nextLine());
            System.out.println("Enter first event's end time (HH:mm):");
            LocalTime event1End = LocalTime.parse(scanner.nextLine());
            System.out.println("Enter second event's start time (HH:mm):");
            LocalTime event2Start = LocalTime.parse(scanner.nextLine());

            if (event1End.isAfter(event2Start)) {
                throw new IllegalArgumentException(" Conflict: Second event starts before first event ends.");
            }

            System.out.println(" No conflict. Scheduling allowed.");

        } catch (DateTimeParseException e) {
            System.out.println(" Invalid time format. Use HH:mm (e.g., 14:30)");
        } catch (IllegalArgumentException e) {
            System.out.println(" " + e.getMessage());
        }
finally {
            scanner.close();
        }

    }
}