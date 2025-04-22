package com.java.inherMtd.internal;

public class IFB {
    private  String brand;
    private int capacity;
    IFB(String brand,int capacity){
        this.brand=brand;
        this.capacity=capacity;
        System.out.println("running inside the ifb const");
    }
    void wash(){
        System.out.println("running inside the wash");
    }
}
