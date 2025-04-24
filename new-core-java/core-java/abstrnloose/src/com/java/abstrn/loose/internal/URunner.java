package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.Phnpy;
import com.java.abstrn.loose.external.UPI;

public class URunner {
    public static void main(String[] args) {
        UPI upi=new Phnpy();
        Payment payment=new Payment(upi);
        payment.amount();

        UPI upi1=new Gpay();
        Payment payment1=new Payment(upi1);
        payment1.amount();
    }


}
