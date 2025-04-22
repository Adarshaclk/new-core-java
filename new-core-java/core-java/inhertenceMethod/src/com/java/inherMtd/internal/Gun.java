package com.java.inherMtd.internal;

public class Gun {
    private int range;
    private boolean barrel;
    Gun(int range,boolean barrel){
        this.barrel=barrel;
        this.range=range;
        System.out.println("running inside the gun");
    }
    void gun(){
        System.out.println("running inisde the gun");
    }
}
