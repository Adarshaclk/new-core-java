package com.java.access.internal;

import com.java.access.external.Comb1;

public class Comb {
    public Comb(){
        System.out.println("running inside const of Comb");
    }
    public void comb(){
        Comb2 cb=new Comb2();
         cb.cmb();
         cb.cmb2();

    }
}
