package com.java.inherMtd.internal;

public class Glass extends Bottle{
    Glass(){
        System.out.println("running inside the Glass const");
    }
    @Override
    void btl() {
        System.out.println("running inside the btl subclass");
    }
    void gls(){
        System.out.println("runnig inisde the gls");
    }
}
