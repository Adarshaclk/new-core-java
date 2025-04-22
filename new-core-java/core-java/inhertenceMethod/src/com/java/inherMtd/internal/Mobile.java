package com.java.inherMtd.internal;

public class Mobile extends Samsung{
    Mobile(){
        super(2000,true);
        System.out.println("running inisde the mobile");
    }
    @Override
    void sam(){
        System.out.println("running inside the subclass sam");
    }
    void mbl(){
        System.out.println("running inisde the mbl");
    }

}
