package com.java.inherMtd.internal;
class GuidedMissile extends Missile {
    public GuidedMissile() {
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