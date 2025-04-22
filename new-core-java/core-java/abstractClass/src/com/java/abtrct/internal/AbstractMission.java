package com.java.abtrct.internal;

public abstract class AbstractMission {
    public AbstractMission(){
        System.out.println("running inosde the Abstract AbstractMission");
    }
    public abstract void mission();

    public void miss(){
        System.out.println("running inside the miss");
    }
}
