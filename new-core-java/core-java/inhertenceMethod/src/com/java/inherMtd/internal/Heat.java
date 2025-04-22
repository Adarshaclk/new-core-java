package com.java.inherMtd.internal;

public class Heat extends Oven{
    Heat(){
        super(100,"sam");
        System.out.println("running inside the Heat");
    }
    @Override
    void oven(){
        System.out.println("running inside the oven subclas");
    }
    void heat(){
        System.out.println("running inside the heat");
    }
}
