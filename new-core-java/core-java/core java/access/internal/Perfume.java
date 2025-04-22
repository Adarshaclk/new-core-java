package com.java.access.internal;

public class Perfume {
    public Perfume(){
        System.out.println("running inside the Perfume const");
    }
   public void perfm(){
        Bellavita bellavita=new Bellavita();
        bellavita.blt();
        bellavita.blt2();
   }

}
