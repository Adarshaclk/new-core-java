package com.java.inherMtd.internal;

class MangoPickle extends Pickle {
    public MangoPickle() {
        super("Mango Pickle", 150);
        System.out.println("running inside the MangoPickle CONST");
    }

    public void taste() {
        System.out.println("running inside the taste method");
    }

    @Override
    public void preserve() {
        System.out.println("overridden preserve method in MangoPickle");
    }
}
