package com.java.abtrct.internal;

public abstract class AbstractWork1 extends AbstractWork{
    public AbstractWork1(){
        System.out.println("running inside the  abstractwork1");
    }
    public  void work1()
    {
        System.out.println("running inside the work1 method in subclass");
    }
    public  void work2(){
        System.out.println("running inside the work2 method in subclass");
    }
    public abstract void work3();

}
