package com.java.inherMtd.internal;

public class AC extends Voltas {
    AC(){
        super(12,true);
        System.out.println("running inside the ac");
    }
    @Override
    void  vlts(){
        System.out.println("running inside the vlts subclass");
    }
    void Aircool(){
        System.out.println("running inisde the Aircooler");
    }

}
