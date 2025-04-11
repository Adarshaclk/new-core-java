package com.java.inherMtd.internal;
class ExpressMetro extends Metro {
    public ExpressMetro() {
        System.out.println("running inside the ExpressMetro CONST");
    }

    public void speed() {
        System.out.println("running inside the speed method");
    }

    @Override
    public void travel() {
        System.out.println("overridden travel method in ExpressMetro");
    }
}
