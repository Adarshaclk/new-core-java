package com.java.inherMtd.internal;

public class Water {
    private int ltr;
    private boolean purified;
    Water(int ltr,boolean purified){
        this.ltr=ltr;
        this.purified=purified;
        System.out.println("running inside the water");
    }
    void water(){
        System.out.println("running insid the water");

    }

    @Override
    public String toString() {
        return "Water{" + "ltr=" + ltr + ", purified=" + purified + '}';
    }
}
