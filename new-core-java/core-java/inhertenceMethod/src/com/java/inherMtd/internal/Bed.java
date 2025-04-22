package com.java.inherMtd.internal;

public class Bed {
    private  String brand;
    private String matrl;
    Bed(String brand,String matrl){
        this.brand=brand;
        this.matrl=matrl;
        System.out.println("running inside the Bed");
    }
    void bed(){
        System.out.println("running inside the bed");
    }
}
