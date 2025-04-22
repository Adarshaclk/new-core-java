package com.java.inherMtd.internal;
class MiniTruck extends Truck {
    public MiniTruck() {
        super(8,"tata");
        System.out.println("running inside the MiniTruck CONST");
    }

    public void capacity() {
        System.out.println("running inside the capacity method");
    }

    @Override
    public void load() {
        System.out.println("overridden load method in MiniTruck");
    }
}
