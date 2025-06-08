package com.java.exception.image;

import com.java.exception.exceptions.NegativeValueException;

import java.util.Scanner;

public class ImageResizer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size reduces the pixcles");
        int pix=scanner.nextInt();
        try{
            if(pix<=0){
                throw new NegativeValueException("enter the positive values for reduce");
            }
            else{
                System.out.println("you enterd "+pix+"pixcles");
            }
        }
        catch (NegativeValueException e){
            System.out.println("error : "+e.getMessage());
        }
    }
}
