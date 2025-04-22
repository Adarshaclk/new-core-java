package com.java.access.internal;

public class Ponds {
    public Ponds(){
        System.out.println("running insode the ponds const");
    }
    void pdr(){
        System.out.println("running inside the ponds default");
    }
    private void pdr1(){
        System.out.println("running inside the ponds private");
    }
    public void pdr2(){
        System.out.println("running inside the ponds public");
        pdr1();
    }


}
