package com.java.inherMtd.internal;

public class Flover {
    private String clr;
    private boolean smell;
    Flover(String clr,boolean smell){
        this.clr=clr;
        this.smell=smell;
        System.out.println("running inside the Flover");
    }
    void flr(){
        System.out.println("running inisde the flr");
    }

    @Override
    public String toString() {
        return "Flover{" + "clr='" + clr + '\'' + ", smell=" + smell + '}';
    }
}
