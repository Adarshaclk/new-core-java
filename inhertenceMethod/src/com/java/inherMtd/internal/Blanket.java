package com.java.inherMtd.internal;

class Blanket {
    protected Blanket() {
        System.out.println("running inside the Blanket CONST");
    }

    public void cover() {
        System.out.println("running inside the cover method");
    }
}