package com.java.inherMtd.internal;

class WallMirror extends Mirror {
    public WallMirror() {
        super("Rectangle", 800);
        System.out.println("running inside the WallMirror CONST");
    }

    public void hang() {
        System.out.println("running inside the hang method");
    }

    @Override
    public void reflect() {
        System.out.println("overridden reflect method in WallMirror");
    }
}
