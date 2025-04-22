package com.java.inherMtd.internal;

public class HP {
    private int cost;
    private String  name;
protected HP(int cost,String name){
    System.out.println("running inside the HP CONST ");
    this.cost=cost;
    this.name=name;
}
public void pc(){
    System.out.println("ruunning inside the pc");
}

    @Override
    public String toString() {
        System.out.println("running inside the to string");
        return "cost :"+cost+ "name :"+name;
    }
}
