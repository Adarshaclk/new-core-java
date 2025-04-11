package com.java.inherMtd.internal;

class Wallet {
    protected Wallet() {
        System.out.println("running inside the Wallet CONST");
    }

    public void carryCash() {
        System.out.println("running inside the carryCash method");
    }
}
