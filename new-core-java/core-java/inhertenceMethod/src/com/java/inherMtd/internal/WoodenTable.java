package com.java.inherMtd.internal;
class WoodenTable extends Table {
    public WoodenTable() {
        super(4,"dining");
        System.out.println("running inside the WoodenTable CONST");
    }

    public void polish() {
        System.out.println("running inside the polish method");
    }

    @Override
    public void furniture() {
        System.out.println("overridden furniture method in WoodenTable");
    }
}
