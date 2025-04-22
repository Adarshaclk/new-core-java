package com.java.inherMtd.internal;

class BeardTrimmer extends Trimmer {
    public BeardTrimmer() {
        super("Philips", 2500);
        System.out.println("running inside the BeardTrimmer CONST");
    }

    public void adjustLength() {
        System.out.println("running inside the adjustLength method");
    }

    @Override
    public void trim() {
        System.out.println("overridden trim method in BeardTrimmer");
    }
}
