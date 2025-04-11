
package com.java.inherMtd.internal;

public class Exide  extends Battery {
    public Exide() {
        System.out.println("running inside the RechargeableBattery CONST");
    }

    public void charge() {
        System.out.println("running inside the charge method");
    }

    @Override
    public void power() {
        System.out.println("overridden power method in RechargeableBattery");
    }
}