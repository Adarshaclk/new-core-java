package com.java.abtrct.internal;

public abstract class AbstractWork {
    public AbstractWork(){
        System.out.println("running inside the no const const");
    }
    public abstract void work1();
    public abstract void work2();


    public void cnctWork(){
        System.out.println("running inside the concrete method od absysrct work");
    }
    public void cncrtWork1(){
        System.out.println("running inside the concrete method od absysrct work");
    }
}
