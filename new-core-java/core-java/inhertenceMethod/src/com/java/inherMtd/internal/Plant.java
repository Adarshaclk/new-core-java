package com.java.inherMtd.internal;

public class Plant extends Tree{
    public Plant(){
        super(50,true);
        System.out.println("running inside the plant const");
    }
    @Override
    void tree(){
        System.out.println("running inside the sublass tre");
    }
    void plt(){
        System.out.println("running inside the ");
    }
}
