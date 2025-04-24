package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.Mobile;



public class Realmecls {
    Mobile mobile;

    Realmecls(Mobile mobile) {
       this.mobile=mobile;
    }
    public void cell() {
        if (mobile != null) {
            this.mobile.phn();
            System.out.println("not null values are occures");
        } else {
            System.out.println("null are occuures");
        }
    }

}
