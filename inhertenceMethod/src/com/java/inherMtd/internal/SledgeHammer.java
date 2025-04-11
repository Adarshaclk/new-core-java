package com.java.inherMtd.internal;
class SledgeHammer extends Hammer {
    public SledgeHammer() {
        System.out.println("running inside the SledgeHammer CONST");
    }

    public void breakConcrete() {
        System.out.println("running inside the breakConcrete method");
    }

    @Override
    public void hit() {
        System.out.println("overridden hit method in SledgeHammer");
    }
}