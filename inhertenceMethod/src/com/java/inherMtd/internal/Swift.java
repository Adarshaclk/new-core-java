package com.java.inherMtd.internal;

public class Swift extends Suzuki {
    Swift(){
        System.out.println("running inside Swift");
    }
    @Override
    void suzuki(){
        System.out.println("running inside the suzuki");
    }
    void swift(){
        System.out.println("running inisde the swift");
    }
}
