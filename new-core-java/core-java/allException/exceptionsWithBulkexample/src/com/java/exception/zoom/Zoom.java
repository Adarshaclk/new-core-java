package com.java.exception.zoom;

import com.java.exception.exceptions.InvaliedZoomLevelException;

import java.util.Scanner;

public class Zoom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=100;
        int min=1;
        System.out.println("value for zooming  process");
        int zoom=scanner.nextInt();
        try{
            if(zoom<=max&&zoom>=min){
                System.out.println("your image is zoomed to "+zoom);
            }
            else {
                throw new InvaliedZoomLevelException("your given value is more than the maximum or minimum values");
            }
        }
        catch (InvaliedZoomLevelException e){
            System.out.println("error "+e.getMessage());
        }
    }
}
