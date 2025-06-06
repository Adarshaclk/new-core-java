package com.java.runner;


import com.java.restrountDto.RestrauntDto;
import com.java.service.RestrauntServiceImoplimentation;
import com.java.service.RestrurentService;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestraunrRunner {
    public static void main(String[] args) {
        String name="RCBJOY";
        String location="Bengluru";
        String conctactdetails="11th Block BTM Benglore";
        String email="rcb@gmail.com";
        int rating=4;
        String[] foodmenu={"sandwitch","Gobi"};
        String type="veg";
        LocalTime openingtime=LocalTime.of(11,0);
        LocalTime closingtime=LocalTime.of(11,30);
        LocalDate bookeddate=LocalDate.of(2025,6,7);
        LocalTime bookedTime=LocalTime.of(10,0);
        RestrauntDto rcbResturentDto=new RestrauntDto();
        rcbResturentDto.setName(name);
        rcbResturentDto.setLoation(location);
        rcbResturentDto.setContact(conctactdetails);
        rcbResturentDto.setEmail(email);
        rcbResturentDto.setRating(rating);
        rcbResturentDto.setFoodmenu(foodmenu);
        rcbResturentDto.setType(type);
        rcbResturentDto.setOpeningTime(openingtime);
        rcbResturentDto.setClosing(closingtime);
        rcbResturentDto.setBookDate(bookeddate);
        rcbResturentDto.setBookTime(bookedTime);

        RestrurentService service = new RestrauntServiceImoplimentation();
        service.validate(rcbResturentDto);

    }
}
