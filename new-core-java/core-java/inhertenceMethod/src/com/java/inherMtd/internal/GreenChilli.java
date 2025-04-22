package com.java.inherMtd.internal;

class GreenChilli extends Chilli {
    public GreenChilli() {
        super("Green", 8);
        System.out.println("running inside the GreenChilli CONST");
    }

    public void makePickle() {
        System.out.println("running inside the makePickle method");
    }

    @Override
    public void spiceUp() {
        System.out.println("overridden spiceUp method in GreenChilli");
    }
}
