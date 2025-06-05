package com.java.restruntException.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestrauntDto {
    private String name;
    private String location;
    private long contact;
    private String email;
    private String[] foodmenu;
    private int rating;
    private String type;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private LocalDate bookingDate;
    private LocalTime bookingTime;
}
