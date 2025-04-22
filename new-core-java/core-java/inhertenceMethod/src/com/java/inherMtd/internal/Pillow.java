package com.java.inherMtd.internal;

public class Pillow extends Bedsheet{
    Pillow(){
        super(20,40);
        System.out.println("running inisde the pillow");
    }
    void bdst(){
        System.out.println("running inside the bdst subclass ");
    }
    void pill(){
        System.out.println("running inisde the pill");
    }
}
