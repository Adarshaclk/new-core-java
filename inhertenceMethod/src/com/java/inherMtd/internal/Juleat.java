package com.java.inherMtd.internal;
public class Juleat extends Romeo {
    public Juleat() {
        System.out.println("running inside the Juleat");
    }

    @Override
    void romeo() {
        System.out.println("running inside the romeo from Juleat");
    }

    public void juleat() {
        System.out.println("running inside the juleat");
    }
}