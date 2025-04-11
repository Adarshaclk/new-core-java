package com.java.inherMtd.internal;

class Keyboard {
    protected Keyboard() {
        System.out.println("running inside the Keyboard CONST");
    }

    public void type() {
        System.out.println("running inside the type method");
    }
}
