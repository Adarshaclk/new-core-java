package com.java.access.internal;

public class Heads {
    public Heads(){
        System.out.println("running inside cont of heads");
    }
    void head(){
        System.out.println("running inside default of heads");
    }
    private void head1(){
        System.out.println("running inside private of heads");

    }
    public void head2(){
        System.out.println("running inside public of heads");
        head1();
    }
}
