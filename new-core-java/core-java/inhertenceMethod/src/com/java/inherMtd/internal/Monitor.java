package com.java.inherMtd.internal;

public class Monitor extends Dell {
    public Monitor() {
        super("Dell UltraSharp", 27.0);
        System.out.println("running inside the Monitor CONST");
    }

    public void display() {
        System.out.println("running inside the display method");
    }

    @Override
    public void dell() {
        System.out.println("overridden dell method in Monitor");
    }
}
