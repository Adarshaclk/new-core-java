package com.java.inherMtd.internal;

public class Oven {
    private int temp;
    private String brand;
    Oven(int temp,String brand){
        this.brand=brand;
        this.temp=temp;
        System.out.println("running inside the oven oven");
    }
    void oven(){
        System.out.println("running inside the oven");
    }
}
