package com.java.access.internal;

public class BagaBeach {
    public BagaBeach(){

    }
    void baga(){
        System.out.println("running inside the  default baga");
    }
    private void baga1(){
        System.out.println("running inside the private baga");
    }
    public void baga2(){
        System.out.println("running inside the public  baga");
        baga1();
    }
}
