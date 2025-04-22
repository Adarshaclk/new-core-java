package com.java.inherMtd.internal;

public class Door {
    private int length;
    private  int width;
    Door(int length,int width){
        this.length=length;
        this.width=width;
        System.out.println("running inside the Door");
    }
    void dor(){
        System.out.println("running inside the dor");
    }
}
