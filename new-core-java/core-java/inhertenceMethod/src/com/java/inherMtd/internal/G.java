package com.java.inherMtd.internal;

public class G extends  Parle{
    G(){
        super("parle",20);
        System.out.println("running inside the G");
    }
    @Override
    void parle(){
        System.out.println("running inside the g");
    }
    void G(){
        System.out.println("running insid the g");
    }
}
