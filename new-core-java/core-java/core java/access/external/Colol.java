package com.java.access.external;

public class Colol {
    public Colol(){
        System.out.println("running inside the cool const");
    }
    void cl(){
        System.out.println("running inside the cool default");
    }
    private void cl1(){
        System.out.println("running inside the cool private");
    }
    public void cl2(){
        System.out.println("running inside the cool public");
        cl1();
    }
}
