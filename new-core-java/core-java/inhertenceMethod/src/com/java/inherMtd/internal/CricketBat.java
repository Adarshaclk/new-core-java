package com.java.inherMtd.internal;

class CricketBat extends Bat {
    public CricketBat() {
        super("SS", 1.2);
        System.out.println("running inside the CricketBat CONST");
    }

    public void hitBall() {
        System.out.println("running inside the hitBall method");
    }

    @Override
    public void swing() {
        System.out.println("overridden swing method in CricketBat");
    }
}
