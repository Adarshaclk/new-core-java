package com.java.inherMtd.internal;
class FlavoredMilk extends Milk {
    public FlavoredMilk() {
        System.out.println("running inside the FlavoredMilk CONST");
    }

    public void addFlavor() {
        System.out.println("running inside the addFlavor method");
    }

    @Override
    public void drink() {
        System.out.println("overridden drink method in FlavoredMilk");
    }
}