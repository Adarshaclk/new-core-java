package com.java.inherMtd.internal;

public class Foam extends Bed {
    Foam(){
        System.out.println("running inisde the Foam");
    }
    @Override
    void bed(){
        System.out.println("running inside the bed");
    }
    void foam(){
        System.out.println("running inside the foam");
    }
}
