package com.java.intrfce.external;

import com.java.intrfce.internal.Maths;

public class Rules implements Maths {
    Rules(){
        System.out.println("running inside the no cont of Rules");
    }
    public void pythogorus(){
        System.out.println("running inside the Rules pythogorus");
    }
}
