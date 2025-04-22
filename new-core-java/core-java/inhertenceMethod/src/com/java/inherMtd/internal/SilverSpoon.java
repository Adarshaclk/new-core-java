package com.java.inherMtd.internal;

class SilverSpoon extends Spoon {
    public SilverSpoon() {
        super("Silver", 1200);
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
