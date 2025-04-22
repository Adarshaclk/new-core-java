package com.java.inherMtd.internal;

class BodySpray extends Perfume {
    public BodySpray() {
        super("Nivea", "Fresh Lime");
        System.out.println("running inside the BodySpray CONST");
    }

    public void refresh() {
        System.out.println("running inside the refresh method");
    }

    @Override
    public void apply() {
        System.out.println("overridden apply method in BodySpray");
    }
}
