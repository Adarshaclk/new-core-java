package com.java.inherMtd.internal;

public class Eagle extends Bird{
    Eagle(){
        super("brown",10);
        System.out.println("runnning inside the Eagle const");
    }
    void brd(){
        System.out.println("running inside the subclass brd");
    }
    void egle(){
        System.out.println("running inside the eagle");
    }

}
