package com.java.inherMtd.internal;

public class Darshan extends Navagraha{
    Darshan(){
        super(20,2012);
        System.out.println("running inisde the Darshan");
    }
    @Override
    void nava(){
        System.out.println("runing inside the nava subclass");
    }
    void darshu(){
        System.out.println("running inside the darshu");
    }
}
