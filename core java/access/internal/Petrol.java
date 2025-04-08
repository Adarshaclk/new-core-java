package com.java.access.internal;

public class Petrol {
    public Petrol() {
        System.out.println("running inside the Petrol const");
    }

    void feul() {
        System.out.println("running inside the Petrol default");
    }
    private void feul1(){
        System.out.println("running inside the Petrol Private");
    }
    public  void feul2(){
        System.out.println("running inside the Petrol public");
        feul1();
    }

}