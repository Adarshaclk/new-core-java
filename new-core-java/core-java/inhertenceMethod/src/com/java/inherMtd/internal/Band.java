package com.java.inherMtd.internal;

public class Band extends Hair{
    Band(){
        super("blonde","curly");
        System.out.println("running inside the band");
    }
    void hair(){
        System.out.println("running inside the hair subclass");
    }
    void band(){
        System.out.println("running inside the band");
    }
}
