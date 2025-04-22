package com.java.inherMtd.internal;

public class Delhi extends India{
    Delhi(){
        super("NM",31);
        System.out.println("running inside the Delhi");
    }
    void india(){
        System.out.println("running inside the india");
    }
    void delhi(){
        System.out.println("running inside the delhi");
    }
}
