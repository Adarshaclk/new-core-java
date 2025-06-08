package com.java.exception.booking;

import com.java.exception.exceptions.BookingDateException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Booking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the booking date");
        String booking=scanner.nextLine();
        try{
            DateTimeFormatter formate=DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date=LocalDate.parse(booking,formate);
            LocalDate nowDate=LocalDate.now();
            if(date.isBefore(nowDate)){
                throw new BookingDateException("you entered the wrong date for date please check");
            }
            else{
                System.out.println("your package booked on date "+date);
            }
        }
        catch (BookingDateException e){
            System.out.println("error :"+e.getMessage());
        }


    }
}
