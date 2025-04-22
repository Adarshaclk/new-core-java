package com.java.inherMtd.internal;

public class Sakre extends Chikmagalru {
    public Sakre() {
        super("Sakrebylu", 1200.0);
        System.out.println("running inside the Sakre CONST");
    }

    public void sakre() {
        System.out.println("running inside the sakre method");
    }

    @Override
    public void ckmgr() {
        System.out.println("overridden ckmgr method in Sakre");
    }
}
