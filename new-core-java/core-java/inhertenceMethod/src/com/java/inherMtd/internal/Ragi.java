package com.java.inherMtd.internal;

class Ragi {
    private int weight;
    private int cost;
    protected Ragi(int weight,int cost) {
        this.cost=cost;
        this.weight=weight;
        System.out.println("running inside the Ragi CONST");
    }

    public void grain() {
        System.out.println("running inside the grain method");
    }

    @Override
    public String toString() {
        return "Ragi{" + "weight=" + weight + ", cost=" + cost + '}';
    }
}