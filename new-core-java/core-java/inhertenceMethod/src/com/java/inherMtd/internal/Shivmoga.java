package com.java.inherMtd.internal;

public class Shivmoga {
    private String name;
    private int popn;
    Shivmoga(String name,int popn){
        this.name=name;
        this.popn=popn;
        System.out.println("running inisde the shivmogga");
    }
    void shmg(){
        System.out.println("running inisde the shmg");
    }

    @Override
    public String toString() {
        return "Shivmoga{" + "name='" + name + '\'' + ", popn=" + popn + '}';
    }
}
