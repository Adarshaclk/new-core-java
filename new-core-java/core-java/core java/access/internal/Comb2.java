package com.java.access.internal;

public class Comb2 {
    public Comb2(){
        System.out.println("running inside const of Comb1");
    }
    void cmb(){
        System.out.println("running inside default of comb");
    }
    private void cmb1(){
        System.out.println("running inside private of comb");
    }
    public void cmb2(){
        System.out.println("running inside public of comb");
    }
}
