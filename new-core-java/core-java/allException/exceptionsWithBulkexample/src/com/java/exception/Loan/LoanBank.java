package com.java.exception.Loan;

import com.java.exception.exceptions.AgeNotEligableException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LoanBank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your date of birth ");
        String date=scanner.next();
        try {
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate newDate=LocalDate.parse(date,formatter);
            LocalDate nowDate=LocalDate.now();
            Period age=Period.between(newDate,nowDate);
            int boy= age.getYears();
            if(boy<21 && boy>60){
                System.out.println("age is group is not loan");
                throw new AgeNotEligableException("age is group is not eligibale forloan");
            }
            else{
                System.out.println("your loan approved");
            }

        }
        catch (AgeNotEligableException e){
            System.out.println("error "+e.getMessage());
        }
    }
}
