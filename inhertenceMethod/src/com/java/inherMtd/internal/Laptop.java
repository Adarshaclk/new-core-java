package com.java.inherMtd.internal;

public class Laptop extends HP{
    public Laptop(){
        System.out.println("running inside the laptop const");
    }
    @Override
    public void pc(){
        System.out.println("running inside subclass the pc");
    }
    public void ram(){
        System.out.println("running inside the ram ");
    }
}
