package com.java.inherMtd.internal;

public class Chrdurga {
    private int poputn;
    private String dam;
    Chrdurga(int poputn,String dam){
        this.poputn=poputn;
        this.dam=dam;
        System.out.println("running inisde the chrdurga");
    }
    void ctd(){
        System.out.println("running inisde the ctd");
    }

    @Override
    public String toString() {
        return "Chrdurga{" + "poputn=" + poputn + ", dam='" + dam + '\'' + '}';
    }
}
