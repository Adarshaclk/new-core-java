package com.java.inherMtd.internal;

public class Earth extends Sun {
    Earth(){
        System.out.println("runnig inside the earth");
    }
    @Override
    public void slr(){
        System.out.println("running inside the subclass slr ");
    }
    public void lnd(){
        System.out.println("running inside the lnd");
    }
}
