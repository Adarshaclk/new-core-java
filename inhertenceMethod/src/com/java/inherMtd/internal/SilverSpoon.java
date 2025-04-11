package com.java.inherMtd.internal;
class SilverSpoon extends Spoon {
    public SilverSpoon() {
        System.out.println("running inside the SilverSpoon CONST");
    }

    public void shine() {
        System.out.println("running inside the shine method");
    }

    @Override
    public void scoop() {
        System.out.println("overridden scoop method in SilverSpoon");
    }
}