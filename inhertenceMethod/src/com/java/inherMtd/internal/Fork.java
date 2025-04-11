package com.java.inherMtd.internal;

class Fork {
    protected Fork() {
        System.out.println("running inside the Fork CONST");
    }
    public void pick() {
        System.out.println("running inside the pick method");
    }
}
