package com.java.access.external;

import com.java.access.internal.Church;
import com.java.access.internal.ChurchGod;

public class ChurchTrust {

    public ChurchTrust() {

        System.out.println("qwerty");
        System.out.println("running inside the cost churchtrust");
    }

    void crt() {
        System.out.println("running inside the default chuch");
    }

    private void crt1() {
        System.out.println("running inside the private chuch");
    }

    public void crt2() {
        System.out.println("running inside the public chuch");
        crt1();


    }
}