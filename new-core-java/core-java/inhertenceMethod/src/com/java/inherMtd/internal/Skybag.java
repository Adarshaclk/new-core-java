package com.java.inherMtd.internal;

public class Skybag {
    private int zip;
    private String brand;
    Skybag(int zip,String  brand){
        this.brand=brand;
        this.zip=zip;
        System.out.println("running inside the skybags");
    }
    void sky(){
        System.out.println("running inside the skybag");
    }
}
