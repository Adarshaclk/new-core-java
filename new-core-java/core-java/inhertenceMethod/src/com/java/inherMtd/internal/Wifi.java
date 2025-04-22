package com.java.inherMtd.internal;

public class Wifi {
    private int pass;
    private int range;
    Wifi(int pass,int range){
        this.pass=pass;
        this.range=range;
        System.out.println("running inisde the wifi");
    }
    void wifi(){
        System.out.println("running inside the wifi");
    }

    @Override
    public String toString() {
        return "Wifi{" + "pass=" + pass + ", range=" + range + '}';
    }
}
