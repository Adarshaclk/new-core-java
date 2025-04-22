package com.java.inherMtd.internal;

public class Window extends Door {
    Window(){
        super(7,4);
        System.out.println("running inside the Window");
    }
    @Override
    void dor(){
        System.out.println("running inside the dor");
    }
    void Windo(){
        System.out.println("rining inside the windo");
    }
}
