package com.java.abstrn.loose.internal;

import com.java.abstrn.loose.external.Body;
import com.java.abstrn.loose.external.Hands;

public class BodyRunner {
    public static void main(String[] args) {
        Body body=new Hands();
        Partcls partcls=new Partcls(body);
        partcls.organ();

        Body body1=new Legs();
        Partcls partcls1=new Partcls(body1);
        partcls1.organ();
    }

}
