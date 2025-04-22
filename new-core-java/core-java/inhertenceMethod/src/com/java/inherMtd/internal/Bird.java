package com.java.inherMtd.internal;

public class Bird {
    private String color;
    private int count;
    Bird(String color,int count){
        this.color=color;
        this.count=count;
        System.out.println("running inside the Bird const");
    }
    void brd(){
        System.out.println("running inside the brd");
    }

    @Override
    public String toString() {
        return "Bird{" + "color='" + color + '\'' +", count=" + count + '}';
    }
}
