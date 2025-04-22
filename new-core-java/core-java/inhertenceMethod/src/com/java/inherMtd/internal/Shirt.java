package com.java.inherMtd.internal;

public class Shirt {
    private String fab;
    private int cost;
    protected Shirt(String fab,int cost){
        this.cost=cost;
        this.fab=fab;
        System.out.println("running inside the shirt const");
    }
    public void clt(){
        System.out.println("running inside the clt");
    }

public String toString() {
    System.out.println("running inside the to string");
    return "fabric :"+fab+ "cost :"+cost;
}
}