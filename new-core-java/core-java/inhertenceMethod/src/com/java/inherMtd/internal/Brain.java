package com.java.inherMtd.internal;

public class Brain {
    private  int weigth;
    private char gender;
    Brain(int weigth,char gender){
        this.weigth=weigth;
        this.gender=gender;
        System.out.println("running inside the brain");
    }
    void brain(){
        System.out.println("running insid ehte brain");
    }
}
