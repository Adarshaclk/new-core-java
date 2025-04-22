package com.java.inherMtd.internal;

public class A4 extends Paper {
    public A4() {
        super("Ruled", 0.1);
        System.out.println("running inside the Notebook CONST");
    }

    public void appr() {
        System.out.println("running inside the writeNotes method");
    }

    @Override
    public void paper() {
        System.out.println("overridden paper method in Notebook");
    }
}
