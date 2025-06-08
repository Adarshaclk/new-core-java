package com.java.exception.meeting;

import com.java.exception.exceptions.MeetingConflictException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MeetingScheduler {

    static class Meeting {
        LocalDateTime start;
        LocalDateTime end;

        public Meeting(LocalDateTime start, int durationMinutes) {
            this.start = start;
            this.end = start.plusMinutes(durationMinutes);
        }

        public boolean overlapsWith(Meeting other) {
            return !(this.end.isBefore(other.start) || this.start.isAfter(other.end));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Meeting> scheduledMeetings = new ArrayList<>();

        try {
            System.out.println("Enter meeting date (yyyy-MM-dd): ");
            LocalDate date = LocalDate.parse(scanner.nextLine());

            System.out.println("Enter meeting start time (HH:mm): ");
            LocalTime time = LocalTime.parse(scanner.nextLine());

            System.out.println("Enter meeting duration in minutes: ");
            int duration = Integer.parseInt(scanner.nextLine());

            LocalDateTime startDateTime = LocalDateTime.of(date, time);
            Meeting newMeeting = new Meeting(startDateTime, duration);
            for (Meeting existing : scheduledMeetings) {
                if (existing.overlapsWith(newMeeting)) {
                    throw new MeetingConflictException(" Meeting time overlaps with an existing meeting.");
                }
            }
            scheduledMeetings.add(newMeeting);
            System.out.println("Meeting scheduled from " + newMeeting.start + " to " + newMeeting.end);

        } catch (MeetingConflictException e) {
            System.out.println(  e.getMessage());
        } catch (Exception e) {
            System.out.println(" Invalid input: " + e.getMessage());
        }
finally {
            scanner.close();
        }

    }
}
