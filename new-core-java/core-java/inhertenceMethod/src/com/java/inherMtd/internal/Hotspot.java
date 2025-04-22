package com.java.inherMtd.internal;

public class Hotspot extends Wifi{
    Hotspot() {
        super(842462462,15);
        System.out.println("running inside the hotspot");
    }
    void wifi(){
        System.out.println("running iniside the wifi");
    }
    void hotspot(){
        System.out.println("running inisde the hotspot");
    }
}
