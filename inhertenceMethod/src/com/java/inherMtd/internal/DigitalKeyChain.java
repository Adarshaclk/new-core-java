package com.java.inherMtd.internal;
class DigitalKeychain extends Keychain {
    public DigitalKeychain() {
        System.out.println("running inside the DigitalKeychain CONST");
    }

    public void track() {
        System.out.println("running inside the track method");
    }

    @Override
    public void holdKeys() {
        System.out.println("overridden holdKeys method in DigitalKeychain");
    }
}
