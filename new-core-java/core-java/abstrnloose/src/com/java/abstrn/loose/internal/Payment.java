package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.UPI;

public class Payment {
    UPI upi;

    Payment(UPI upi){
        this.upi=upi;
    }

    public void amount(){
        if(upi!=null){
            this.upi.pay();
            System.out.println("not null values are occured");
        }
        else{
            System.out.println("null values occures");
        }
    }
}
