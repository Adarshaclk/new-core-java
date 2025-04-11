package com.java.inherMtd.internal;

public class Beer extends  Alchol{
    Beer(){
        System.out.println("running inside the beer const");
    }
    @Override
    void alc(){
        System.out.println("running inside the subclass alc");
    }
    void ber(){
        System.out.println("running inside the Beer ");
    }
}

