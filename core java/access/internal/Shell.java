package com.java.access.internal;

public class Shell {
    public Shell(){
        System.out.println("running inside the Shell const");
    }
    public void shell(){
        Petrol ptrl=new Petrol();
        ptrl.feul();
        ptrl.feul2();

    }
}
