package com.java.inherMtd.internal;

public class RX extends Yamaha{
    RX(){
        super("yaamha",102000);
        System.out.println("running insde the rx");
    }
    @Override
    void yamaha(){
        System.out.println("running inside the yamaha");
    }
    void rx(){
        System.out.println("runninh inside the rx");
    }
}
