package com.java.inherMtd.internal;

class Keychain {
    protected Keychain() {
        System.out.println("running inside the Keychain CONST");
    }

    public void holdKeys() {
        System.out.println("running inside the holdKeys method");
    }
}