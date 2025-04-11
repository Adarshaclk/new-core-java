package com.java.inherMtd.internal;
class BattleTank extends Tank {
    public BattleTank() {
        System.out.println("running inside the BattleTank CONST");
    }

    public void armor() {
        System.out.println("running inside the armor method");
    }

    @Override
    public void fire() {
        System.out.println("overridden fire method in BattleTank");
    }
}