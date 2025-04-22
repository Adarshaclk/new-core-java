package com.java.inherMtd.internal;

public class Ore {
    private int weigth;
    private int cost;
    Ore(int weigth,int cost){
        this.cost=cost;
        this.weigth=weigth;
        System.out.println("running inside the ore const");
    }
    void ore(){
        System.out.println("running inside the ore");
    }

    @Override
    public String toString() {
        return "Ore{" + "weigth=" + weigth + ", cost=" + cost + '}';
    }
}
