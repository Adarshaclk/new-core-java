package com.java.inherMtd.internal;

public class Rocket {
    private int capacity;
    private String name;
    Rocket(int capacity,String name){
        this.capacity=capacity;
        this.name=name;
        System.out.println("running inside the Rocket const");
    }
    void  rct(){
        System.out.println("running inside the rct");
    }

    @Override
    public String toString() {
        return "Rocket{" + "capacity=" + capacity + ", name='" + name + '\'' + '}';
    }
}
