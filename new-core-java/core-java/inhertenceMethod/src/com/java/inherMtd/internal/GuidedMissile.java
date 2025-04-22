package com.java.inherMtd.internal;
class GuidedMissile extends Missile {
    public GuidedMissile() {
        super("tejas",4633);
        System.out.println("running inside the GuidedMissile CONST");
    }

    public void target() {
        System.out.println("running inside the target method");
    }

    @Override
    public void launch() {
        System.out.println("overridden launch method in GuidedMissile");
    }
}