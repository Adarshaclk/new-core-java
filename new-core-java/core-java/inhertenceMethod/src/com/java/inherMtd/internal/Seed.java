package com.java.inherMtd.internal;

public class Seed {
    private int count;
    private String name;
    Seed(int count,String name){
        this.count=count;
        this.name=name;
        System.out.println("running inisd the seed");
    }
    void sed(){
        System.out.println("running inside the sed");
    }

    @Override
    public String toString() {
        return "Seed{" + "count=" + count + ", name='" + name + '\'' + '}';
    }
}
