package com.java.inherMtd.internal;

public class Apple extends Fruit{
    Apple(){
        System.out.println("running inside the Apple");
    }
    @Override
    void fruit(){
        System.out.println("running inside the fruit");
    }
    void apple(){
        System.out.println("running inisde the appl");
    }
}
