package com.java.inherMtd.internal;

public class Samsung {
    private int cost;
    private boolean touch;
    Samsung(int cost,boolean touch){
        System.out.println("running inisde the samsung");
    }
    void sam(){
        System.out.println("running inisde the sam");
    }

    @Override
    public String toString() {
        return "Samsung{" + "cost=" + cost + ", touch=" + touch + '}';
    }
}
