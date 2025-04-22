package com.java.inherMtd.internal;

public class Voltas {
    private int maxtemp;
    private boolean remote;
    Voltas(int maxtemp,boolean remote){
        this.maxtemp=maxtemp;
        this.remote=remote;
        System.out.println("runnig inside the voltas");
    }
    void vlts(){
        System.out.println("running inside the vlts");
    }

    @Override
    public String toString() {
        return "Voltas{" + "maxtemp=" + maxtemp + ", remote=" + remote + '}';
    }
}
