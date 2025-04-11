package com.java.inherMtd.internal;

public class Darshan extends Navagraha{
    Darshan(){
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
