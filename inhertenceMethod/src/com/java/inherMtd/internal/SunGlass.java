package com.java.inherMtd.internal;
class SunGlasses extends Spects {
    public SunGlasses() {
        System.out.println("running inside the SunGlasses CONST");
    }

    public void blockSunlight() {
        System.out.println("running inside the blockSunlight method");
    }

    @Override
    public void wear() {
        System.out.println("overridden wear method in SunGlasses");
    }
}