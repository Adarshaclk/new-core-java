package com.java.inherMtd.internal;

public class Parle {
    private String brand;
    private int price;
    Parle(String brand,int price){
        this.brand=brand;
        this.price=price;
        System.out.println("running inisde the parle");
    }
    void parle(){
        System.out.println("running inisde the parle");
    }

    @Override
    public String toString() {
        return "Parle{" + "brand='" + brand + '\'' + ", price=" + price + '}';
    }
}
