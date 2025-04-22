package com.java.inherMtd.internal;

public class Pen {
    private String name;
    private int cost;
    Pen(String name,int cost){
        this.cost=cost;
        this.name=name;
        System.out.println("running inside the pen");
    }
    void wrt(){
        System.out.println("running inside the wrt");
    }

    @Override
    public String toString() {
        return "Pen{" + "name='" + name + '\'' + ", cost=" + cost + '}';
    }
}
