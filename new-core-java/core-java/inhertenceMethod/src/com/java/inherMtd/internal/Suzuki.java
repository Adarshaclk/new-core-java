package com.java.inherMtd.internal;

public class Suzuki {
    private String brand;
    private int price;
    Suzuki(String brand,int price){
        this.brand=brand;
        this.price=price;
        System.out.println("running inisde the Suzuki");
    }
    void suzuki(){
        System.out.println("running inside the suzuki");
    }
}
