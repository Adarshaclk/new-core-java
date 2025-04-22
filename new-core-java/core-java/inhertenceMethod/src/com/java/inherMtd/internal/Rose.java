package com.java.inherMtd.internal;

public class Rose extends  Flover{
    Rose(){
        super("red",true);
        System.out.println("running inside the Rose const");
    }
    @Override
    void flr(){
        System.out.println("running inisde the flr subclass");
    }
    void rse(){
        System.out.println("running inside the rse");
    }

}
