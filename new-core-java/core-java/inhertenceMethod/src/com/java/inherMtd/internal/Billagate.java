package com.java.inherMtd.internal;

public class Billagate {
    private String owner;
    private  String compny;
    Billagate(String owner,String compny){
        this.owner=owner;
        this.compny=compny;
        System.out.println("running iniside the Billgates");
    }
    void bill(){
        System.out.println("running inisde the bill");
    }
}
