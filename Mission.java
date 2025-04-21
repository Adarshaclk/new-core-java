package com.java.abtrct.internal;

public class Mission extends AbstractMission {
    public Mission(){
        System.out.println("running inside the mission");
    }
    @Override
    public void mission(){
        System.out.println("running inside the mission !!!!");
    }
    public void ko(){
        System.out.println("running inside ko");
    }
}
