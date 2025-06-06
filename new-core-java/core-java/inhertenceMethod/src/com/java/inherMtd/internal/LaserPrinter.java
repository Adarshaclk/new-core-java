package com.java.inherMtd.internal;

class LaserPrinter extends Printer {
    public LaserPrinter() {
        super("HP LaserJet", 25000);
        System.out.println("running inside the LaserPrinter CONST");
    }

    public void speed() {
        System.out.println("running inside the speed method");
    }

    @Override
    public void print() {
        System.out.println("overridden print method in LaserPrinter");
    }
}
