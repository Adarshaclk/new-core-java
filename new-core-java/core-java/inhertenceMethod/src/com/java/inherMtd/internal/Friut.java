package com.java.inherMtd.internal;

public class Friut extends Seed{
    Friut(){
        super(30,"mango");
        System.out.println("running inside the Fruit");
    }
    @Override
    void sed(){
        System.out.println("runnin inside the frt subclass");
    }
    void frt(){
        System.out.println("running inside the frt");
    }
}
