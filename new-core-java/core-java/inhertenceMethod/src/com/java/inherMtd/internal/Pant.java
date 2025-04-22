package com.java.inherMtd.internal;

public class Pant extends Shirt {
    Pant()
    {
        super("cotton.",500);
        System.out.println("running inside the Pat const");
    }
    @Override
    public void clt(){
        System.out.println("running inside subclass the clt");
    }

    public void pt(){
       System.out.println("running inside the pt");
    }
}
