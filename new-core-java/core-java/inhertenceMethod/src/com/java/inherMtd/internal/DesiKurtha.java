package com.java.inherMtd.internal;

class DesiKurtha extends Kurtha {
    public DesiKurtha() {
        super("Cotton", 1500);
        System.out.println("running inside the DesiKurtha CONST");
    }

    public void embroidery() {
        System.out.println("running inside the embroidery method");
    }

    @Override
    public void wear() {
        System.out.println("overridden wear method in DesiKurtha");
    }
}
