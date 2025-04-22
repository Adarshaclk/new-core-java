package com.java.inherMtd.internal;
class LongBow extends Bow {
    public LongBow() {
        super("wooden",20);
        System.out.println("running inside the LongBow CONST");
    }

    public void range() {
        System.out.println("running inside the range method");
    }

    @Override
    public void shoot() {
        System.out.println("overridden shoot method in LongBow");
    }
}