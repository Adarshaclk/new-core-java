package com.java.inherMtd.internal;

public class Fish extends Water{
    Fish(){
        System.out.println("running inside the fish");
    }
    @Override
    void water(){
        System.out.println("running inside the twwate");
    }
    void fish(){
        System.out.println("running inside the fish");
    }
}
