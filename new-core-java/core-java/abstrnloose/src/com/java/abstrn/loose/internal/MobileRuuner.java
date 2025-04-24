package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.Mobile;
import com.java.abstrn.loose.external.Samsung;

public class MobileRuuner {
    public static void main(String[] args) {
        Mobile mobile=new Samsung();
        Realmecls realmecls=new Realmecls(mobile);
        realmecls.cell();

        Mobile mobile1=new Oppo();
        Realmecls realmecls1=new Realmecls(mobile1);
        realmecls1.cell();
    }
}
