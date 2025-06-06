package com.java.service;

import com.java.exception.*;
import com.java.restrountDto.RestrauntDto;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestrauntServiceImoplimentation implements RestrurentService {
    @Override
    public boolean validate(RestrauntDto restrauntDto) {
        if(restrauntDto!=null){
            try {
                if (null == restrauntDto.getName()) {
                    throw new NullPointerException();
                } else if (restrauntDto.getName().length() < 3) {
                    throw new NameSizeException("name is lesss than 3");
                } else if (restrauntDto.getName().length() > 25) {
                    throw new NameSizeException("name is lesss than 3");

                }
                else if (restrauntDto.getName().matches("[0-9.*]")){
                   throw  new NumberException("name containes number") ;
                }
                    else {
                    System.out.printf("valied name");
                }
            }
            catch(NullPointerException|NameSizeException |NumberException e){
                System.out.println("message"+e.getMessage());
            }
        }
        int rate=restrauntDto.getRating();
        try {
            if (rate == 0) {
                throw new RatingException("rating is 0");
            } else if (rate<3) {
                throw new RatingException("rating is less 3");
            }
        } catch (RatingException e) {
            System.out.println("valied "+e.getMessage());
        }
        try {
            String[] menu = restrauntDto.getFoodmenu();
            if (menu == null) {
                throw new NullPointerException("menu is full");
            }
            for (int i = 0; i < menu.length; i++) {
                System.out.println("menu item" + menu[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException |NullPointerException e ){
                System.out.println("Menu included "+e.getMessage());
            }
        try{
            LocalTime openingTime=restrauntDto.getOpeningTime();
            LocalTime minAllowedTime=LocalTime.of(9,0);
            if(openingTime.isBefore(minAllowedTime)){
                throw new InvalidOpeningTimeException("Opening time must not be before 9:00 AM");
            }
            System.out.println("Opening Time is valid "+openingTime);
        }
        catch (InvalidOpeningTimeException e){
            System.out.println("Invalid Opeining Time  -->  "+e.getMessage());
        }
        try{
            LocalTime closingTime=restrauntDto.getClosing();
            LocalTime maxAllowedTime=LocalTime.of(12,0);
            if(closingTime.isAfter(maxAllowedTime)){
                throw new InvalidClosingTimeException("Closing Time must not be before 12:0PM");
            }
            System.out.println("Closing time is valid "+closingTime);
        }
        catch (InvalidClosingTimeException e){
            System.out.println("Invalid Closing Time -->  "+e.getMessage());
        }
        try{
            LocalDate bookingdate=restrauntDto.getBookDate();
            LocalDate today=LocalDate.now();
            if(bookingdate.isBefore(today)){
                throw new InvalidBookingDateException("Booking Date Cannot be a past Date");

            }
            System.out.println("Booking Date is valid "+ bookingdate);

        }
        catch (InvalidBookingDateException e){
            System.out.println("Invalid Booking Date -->  "+e.getMessage());
        }
        try{
            LocalTime bookingtime=restrauntDto.getBookTime();
            LocalTime minTimeAllowed=LocalTime.of(9,0);
            LocalTime closingTime=restrauntDto.getClosing();
            LocalTime maxTimeAllowed=LocalTime.of(12,0);
            if(bookingtime.isBefore(minTimeAllowed)&&closingTime.isAfter(maxTimeAllowed)){
                throw new InvalidOpeningClosingException("Booking Time is Before 9 AM and After 12 PM");

            }
            System.out.println("Booking Time is valid" +bookingtime);
        }
        catch (InvalidOpeningClosingException e){
            System.out.println("Invalid Booking and closing Time -->  "+e.getMessage());
        }
        return true;
    }
}