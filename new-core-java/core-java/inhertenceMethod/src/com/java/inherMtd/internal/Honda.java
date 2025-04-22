package com.java.inherMtd.internal;

public class Honda {
    private int milage;
    private boolean smart;
    Honda(int milage,boolean smart){
        this.milage=milage;
        this.smart=smart;
        System.out.println("running inside the Honda const");
    }
    void honda(){
        System.out.println("running inside the hoda");
    }
}
