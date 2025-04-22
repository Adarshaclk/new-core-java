package com.java.inherMtd.internal;

public class RCB {
    private String team;
    private String captain;
    RCB(String team,String captain){
        this.captain=captain;
        this.team=team;
        System.out.println("running inside the rcb");
    }
    void rcb(){
        System.out.println("running inside the rcb");
    }

    @Override
    public String toString() {
        return "RCB{" + "team='" + team + '\'' + ", captain='" + captain + '\'' + '}';
    }
}
