package com.java.inherMtd.internal;

public class Washingmch extends IFB {
    Washingmch(){
        super("IFB",13);
        System.out.println("running inside the washingmch");
    }
    @Override
    void wash(){
        System.out.println("running inside the wash subclass");
    }
    void mch(){
        System.out.println("running inside the mch");
    }
}
