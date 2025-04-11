package com.java.inherMtd.internal;
class Gold extends GoldChain {
    public Gold() {
        System.out.println("running inside the FancyGoldChain CONST");
    }

    public void design() {
        System.out.println("running inside the design method");
    }

    @Override
    public void shine() {
        System.out.println("overridden shine method in FancyGoldChain");
    }
}