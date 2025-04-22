package com.java.inherMtd.internal;

public class Davanagere {
    private String name;
    private int popltn;
    Davanagere(String name,int popltn){
        this.name=name;
        this.popltn=popltn;
        System.out.println("running inside the dvg");
    }
    void dvg(){
        System.out.println("running inside the dvg");
    }

    @Override
    public String toString() {
        return "Davanagere{" + "name='" + name + '\'' + ", popltn=" + popltn + '}';
    }
}
