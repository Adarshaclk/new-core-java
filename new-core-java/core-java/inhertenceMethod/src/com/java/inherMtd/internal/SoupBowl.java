package com.java.inherMtd.internal;
class SoupBowl extends Bowl {
    public SoupBowl() {
        super(12,100);
        System.out.println("running inside the SoupBowl CONST");
    }

    public void serve() {
        System.out.println("running inside the serve method");
    }

    @Override
    public void hold() {
        System.out.println("overridden hold method in SoupBowl");
    }
}
