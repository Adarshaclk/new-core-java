package com.java.inherMtd.internal;

public class MP5 extends Gun {
    MP5(){
        super(100,true);
        System.out.println("running inside the mp5");
    }
    void gun(){
        System.out.println("running inside the gun");
    }
    void mp(){
        System.out.println("running inisde the mp");
    }
}
