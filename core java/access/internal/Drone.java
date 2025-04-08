package com.java.access.internal;

import com.java.access.external.Dronprt;

public class Drone {
    public Drone(){
        System.out.println("running inside const of Drone");
    }
     public void  drone(){
        Motor motor=new Motor();
        motor.motor();
        motor.motor2();

     }
}
