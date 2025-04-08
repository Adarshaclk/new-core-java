package com.java.access.internal;

public class Bellavita {
    public Bellavita(){
        System.out.println("running inside the Bellavita const");
    }
    void blt(){
        System.out.println("running inside the Bellavita default");
    }
    private void blt1(){
        System.out.println("running inside the Bellavita private");
    }
    public void blt2(){
        System.out.println("running inside the Bellavita public");
        blt1();
    }
}
