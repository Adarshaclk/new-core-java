package com.java.inherMtd.internal;

public class JCB {
    private String brand;
    private int  model;
    JCB(String brand,int model){
        this.brand=brand;
        this.model=model;
        System.out.println("running inisde the JCB");
    }
    void jcb(){
        System.out.println("running inside the jcb");
    }
}
