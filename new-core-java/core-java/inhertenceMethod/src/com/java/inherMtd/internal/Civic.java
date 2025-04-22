package com.java.inherMtd.internal;

public class Civic extends Honda {
    Civic(){
        super(23,true);
        System.out.println("running inside the civic");
    }
    @Override
    void honda(){
        System.out.println("running inside the honda");
    }
    void civic(){
        System.out.println("running inisde the civic");
    }
}
