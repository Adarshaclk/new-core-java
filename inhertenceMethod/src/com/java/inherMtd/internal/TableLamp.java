package com.java.inherMtd.internal;
class TableLamp extends Lamp {
    public TableLamp() {
        System.out.println("running inside the TableLamp CONST");
    }
    public void adjust() {
        System.out.println("running inside the adjust method");
    }
    @Override
    public void glow() {
        System.out.println("overridden glow method in TableLamp");
    }
}