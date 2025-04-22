package com.java.inherMtd.internal;

public class Cdh extends Hero{
    Cdh(){
        super(true,180);
        System.out.println("running inisde the cdh");
    }
    @Override
    void hero(){
        System.out.println("running inside hero");
    }
    void cdh(){
        System.out.println("running inside the cdh");
    }
}
