package com.java.inherMtd.internal;

public class Sattelite extends Rocket {
    Sattelite(){
        super(1200,"PSLV");
        System.out.println("running inisde the Sattelilte");
    }
    void rct(){
        System.out.println("running inosde the rct subclass");
    }
    void stlt(){
        System.out.println("running inside the stllt");
    }
}
