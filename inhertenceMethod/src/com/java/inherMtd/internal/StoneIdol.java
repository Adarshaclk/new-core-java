package com.java.inherMtd.internal;
class StoneIdol extends Idol {
    public StoneIdol() {
        System.out.println("running inside the StoneIdol CONST");
    }

    public void polish() {
        System.out.println("running inside the polish method");
    }

    @Override
    public void worship() {
        System.out.println("overridden worship method in StoneIdol");
    }
}
