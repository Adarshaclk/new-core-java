package com.java.inherMtd.internal;

public class Benlore extends Karnataka{
    Benlore(){
        super(31,"karnataka");
        System.out.println("running inisde the benglore");
    }

    void bnglr(){
        System.out.println("running inside the bnglr");
    }
    @Override
    void state(){
        System.out.println("running inisde the karnatka");
    }
}
