package com.java.inherMtd.internal;

class Printer {
    protected Printer() {
        System.out.println("running inside the Printer CONST");
    }

    public void print() {
        System.out.println("running inside the print method");
    }
}