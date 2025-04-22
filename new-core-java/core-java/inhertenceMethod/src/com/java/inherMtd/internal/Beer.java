package com.java.inherMtd.internal;

public class Beer extends  Alchol{
    Beer(){
        super(90,"BW");
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

