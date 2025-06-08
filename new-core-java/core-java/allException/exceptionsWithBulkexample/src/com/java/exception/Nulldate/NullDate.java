package com.java.exception.Nulldate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NullDate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the date");
        String date=scanner.nextLine();
        try{
            if(date.equals("null")){
                System.out.println("you enterd the null instead of date enter the valied date");
                date=scanner.nextLine();
                DateTimeFormatter formate=DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate newDate=LocalDate.parse(date,formate);
                System.out.println("your new date is "+newDate);
            }
            else{
                System.out.println("you enterd date is "+date);
            }
        }catch (NullPointerException e){
            System.out.println("error :"+e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
