package com.java.inherMtd.internal;

public class CPU {
    private int ram;
    private String proceser;
    CPU(int ram,String proceser){
        this.ram=ram;
        this.proceser=proceser;
        System.out.println("running iniside the cpu");
    }
    void cpu(){
        System.out.println("running inisde the cpu");
    }
}
