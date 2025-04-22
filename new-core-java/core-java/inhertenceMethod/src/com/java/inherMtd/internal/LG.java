package com.java.inherMtd.internal;

public class LG {
    private  int cost;
    private boolean doubleDoor;
    LG(int cost,boolean doubleDoor){
        this.cost=cost;
        this.doubleDoor=doubleDoor;
        System.out.println("running inside the LG const");
    }
    void lg(){
        System.out.println("running inside the lg");
    }

    @Override
    public String toString() {
        return "LG{" + "cost=" + cost + ", doubleDoor=" + doubleDoor + '}';
    }
}
