package com.java.inherMtd.internal;
class SaladFork extends Fork {
    public SaladFork() {
        System.out.println("running inside the SaladFork CONST");
    }

    public void grip() {
        System.out.println("running inside the grip method");
    }

    @Override
    public void pick() {
        System.out.println("overridden pick method in SaladFork");
    }
}