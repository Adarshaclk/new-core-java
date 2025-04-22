package com.java.inherMtd.internal;

public class Micro extends Billagate{
    Micro(){
        super("billgates","Microsoft");
        System.out.println("running inside the micro const");
    }
    @Override
    void bill(){
        System.out.println("running inisde the bill");
    }
    void micro(){
        System.out.println("running inside the micro");
    }
}
