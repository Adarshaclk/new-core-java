package com.java.inherMtd.internal;

class BasmatiRice extends Rice {
    public BasmatiRice() {
        super("Basmati", 200);
        System.out.println("running inside the BasmatiRice CONST");
    }

    public void aroma() {
        System.out.println("running inside the aroma method");
    }

    @Override
    public void cook() {
        System.out.println("overridden cook method in BasmatiRice");
    }
}
