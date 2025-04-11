package com.java.inherMtd.internal;
class AgriLand extends Land {
    public AgriLand() {
        System.out.println("running inside the AgriculturalLand CONST");
    }

    public void cultivate() {
        System.out.println("running inside the cultivate method");
    }

    @Override
    public void property() {
        System.out.println("overridden property method in AgriculturalLand");
    }
}
