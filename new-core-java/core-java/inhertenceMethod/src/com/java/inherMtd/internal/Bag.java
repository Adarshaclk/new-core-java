package com.java.inherMtd.internal;

public class Bag extends Skybag{
    Bag(){
        super(6,"Skybag");
        System.out.println("running inisde the bag");
    }
    @Override
    void sky(){
        System.out.println("running inside ");
    }
    void bag(){
        System.out.println("running inside the bag");
    }

}
