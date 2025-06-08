package com.java.exception.iot;

import com.java.exception.exceptions.NoWifiConnectionException;

import java.util.Scanner;

public class Iot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int wifi;
        System.out.println("enter the 1 or 0 for on and off of wifi");
        wifi=scanner.nextInt();
        try{
            if(wifi==1){
                System.out.println("wifi is ON position iot device is correctly working");
            }
            else{
                throw  new NoWifiConnectionException("wifi is turned off iot device is not working");
            }
        }
        catch (NoWifiConnectionException e){
            System.out.println("error :"+e.getMessage());
        }
    }
}
