package com.java.inherMtd.internal;

public class Tab extends Mac {

    Tab(){
        super("Apple",12300);
        System.out.println("runnning inside the Tab const");
    }
    @Override
    void Mc(){
        System.out.println("running inside the subclas mc");
    }
    void tab(){
        System.out.println("running insod the tab");
    }

}
