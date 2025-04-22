package com.java.inherMtd.internal;

class WoolBlanket extends Blanket {
    public WoolBlanket() {
        super("Wool", 1200);
        System.out.println("running inside the WoolBlanket CONST");
    }

    public void warm() {
        System.out.println("running inside the warm method");
    }

    @Override
    public void cover() {
        System.out.println("overridden cover method in WoolBlanket");
    }
}
