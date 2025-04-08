package com.java.access.external;

public class Tails {
    public Tails(){
        System.out.println("running inside cont of Tails");
    }
    void tail(){
        System.out.println("running inside default of tails");
    }
    private void tail1(){
        System.out.println("running inside private of Tails");
    }
    public  void tails2(){
        System.out.println("running inside public of Tails");
    }
}
