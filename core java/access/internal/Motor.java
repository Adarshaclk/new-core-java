package com.java.access.internal;

public class Motor {
    public Motor(){
        System.out.println("running inside const of Drone");
    }
    void motor(){
        System.out.println("running inside default of drone");
    }
    private void motor1(){
        System.out.println("running inside private  of drone");
    }
    public void motor2(){
        System.out.println("running inside public  of drone");
        motor1();
    }
}
