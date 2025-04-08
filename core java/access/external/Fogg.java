package com.java.access.external;

public class Fogg {
    void perf(){
        System.out.println("running inside the Perfume default");
    }
    private void perf1(){
        System.out.println("running inside the Perfume private");
    }
    public void perf2(){
        System.out.println("running inside the Perfume public");
        perf1();
    }
}
