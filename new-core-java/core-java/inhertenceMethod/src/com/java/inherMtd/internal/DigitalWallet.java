package com.java.inherMtd.internal;

class DigitalWallet extends Wallet {
    public DigitalWallet() {
        super("PhonePe", 10000);
        System.out.println("running inside the DigitalWallet CONST");
    }

    public void scanQR() {
        System.out.println("running inside the scanQR method");
    }

    @Override
    public void carryCash() {
        System.out.println("overridden carryCash method in DigitalWallet");
    }
}
