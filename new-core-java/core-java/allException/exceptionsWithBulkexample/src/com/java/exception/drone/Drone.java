package com.java.exception.drone;

import com.java.exception.exceptions.LowBatteryException;

import java.util.Scanner;

public class Drone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the battery status");
        int charge=scanner.nextInt();
        try{
            if(charge>10){
                System.out.println("battery status is "+charge);
            }
            else{

                throw new LowBatteryException("Low battery is very less drone is return to base");
            }
        }
        catch (LowBatteryException e){
            System.out.println("error "+e.getMessage());
        }
    }
}
