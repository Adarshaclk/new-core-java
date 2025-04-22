package com.java.inherMtd.internal;

public class Hero {
    private boolean twoweeler;
    private int engine;
    Hero(boolean twoweeler,int engine){
        this.twoweeler=twoweeler;
        this.engine=engine;
        System.out.println("running inside the Hero");
    }
    void hero(){
        System.out.println("running inside the hero");
    }

    @Override
    public String toString() {
        return "Hero{" + "twoweeler=" + twoweeler + ", engine=" + engine + '}';
    }
}
