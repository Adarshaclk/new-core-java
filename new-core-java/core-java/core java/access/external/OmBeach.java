package com.java.access.external;

public class OmBeach {
    public OmBeach(){

    }
    void om(){
        System.out.println("running inside the default om");
    }
    private void om1(){
        System.out.println("running inside the private om");
    }
    public  void om2(){
        System.out.println("running inside the public om");
        om1();
    }
}
