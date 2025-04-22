package com.java.inherMtd.internal;

public class Hita extends JCB{
    Hita(){
        super("Hitachi",23486);
        System.out.println("running insid the hita");
    }
    @Override
    void jcb(){
        System.out.println("running insdie the jcb");
    }
    void hita(){
        System.out.println("running inosde the hita");
    }

}
