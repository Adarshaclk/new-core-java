package com.java.inherMtd.internal;
class ToothpasteTube extends Tube {
    public ToothpasteTube() {
        System.out.println("running inside the ToothpasteTube CONST");
    }

    public void mintFlavor() {
        System.out.println("running inside the mintFlavor method");
    }

    @Override
    public void squeeze() {
        System.out.println("overridden squeeze method in ToothpasteTube");
    }
}
