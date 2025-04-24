package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.UPI;

public class Gpay implements UPI {

    @Override
    public void pay() {
        System.out.println("running inisde the pay of gpay");
    }
}
