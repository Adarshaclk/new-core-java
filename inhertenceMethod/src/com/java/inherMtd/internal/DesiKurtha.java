package com.java.inherMtd.internal;
class DesiKurtha extends Kurtha {
    public DesiKurtha() {
        System.out.println("running inside the DesignerKurtha CONST");
    }

    public void embroidery() {
        System.out.println("running inside the embroidery method");
    }

    @Override
    public void wear() {
        System.out.println("overridden wear method in DesignerKurtha");
    }
}