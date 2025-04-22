package com.java.inherMtd.internal;

public class Fruit {
    private  String fruit;
    private boolean seed;
    Fruit(String fruit,boolean seed){
        this.fruit=fruit;
        this.seed=seed;
        System.out.println("running inside the Fruit");
    }
    void fruit(){
        System.out.println("running inside the fruit");
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruit='" + fruit + '\'' + ", seed=" + seed + '}';
    }
}
