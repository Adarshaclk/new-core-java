package com.java.inherMtd.internal;

public class Hair {
    private String colr;
    private String type;
    Hair(String colr,String type){
        this.colr=colr;
        this.type=type;
        System.out.println("running inside the Hair");
    }
    void hair(){
        System.out.println("running inside the hair");
    }
}
