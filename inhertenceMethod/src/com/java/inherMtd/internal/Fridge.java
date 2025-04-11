package com.java.inherMtd.internal;

public class Fridge extends LG{
    Fridge(){
        System.out.println("running inside the fridge");
    }
    @Override
    void lg(){
        System.out.println("running inside the lg subclass");
    }
    void fridge(){
        System.out.println("running inside the fridge");
    }
}
