package com.java.restrountDto;


import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestrauntDto {
    private String name;
    private String loation;
    private String contact;
    private String email;
    private int rating;
    private String[] foodmenu;
    private String type;
    private LocalTime openingTime;
    private LocalTime closing;
    private LocalDate bookDate;
    private LocalTime bookTime;

}
