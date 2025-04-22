package com.java.access.external;

public class Dronprt {

    public Dronprt(){
        System.out.println("running inside const of droneprt");
    }
    void prt(){
        System.out.println("running inside default of droneprt");
    }
    private void  prt1(){
        System.out.println("running inside private of droneprt");
    }
    public void prt2(){
        System.out.println("running inside public  of droneprt");
        prt1();
    }
}
