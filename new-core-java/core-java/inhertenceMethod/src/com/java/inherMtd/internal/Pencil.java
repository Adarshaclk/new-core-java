package com.java.inherMtd.internal;

public class Pencil extends Pen{
    Pencil(){
        super("celo",10);
        System.out.println("running inside the Pencil const");
    }
    void wrt(){
        System.out.println("running inside the subclass wrt ");
    }
    void pncl(){
        System.out.println("running inside the pncl");
    }
}
