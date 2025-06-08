package com.java.exception.route;

import com.java.exception.exceptions.RouteNotFoundException;

import java.util.Scanner;

public class Route {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] pin={577522,577502,578569,534663,564574};
        System.out.println("enter t your city pin code that to check the route not avialble arte not");
        int upin=scanner.nextInt();
        try{
            for(int i=0;i<pin.length;i++){
                if(pin[i]==upin){
                    System.out.println("congragulations !!! your city have delivary of "+upin);
                }
                else{
                    throw new RouteNotFoundException("your city is not found to track ");
                }
            }
        }
        catch (RouteNotFoundException e){
            System.out.println("error :"+e.getMessage());
        }
    }
}
