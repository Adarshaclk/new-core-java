package com.java.inherMtd.internal;

class Bowl {
    private int size;
    private int cost;
    protected Bowl(int size,int cost) {
        this.cost=cost;
        this.size=size;
        System.out.println("running inside the Bowl CONST");
    }

    public void hold() {
        System.out.println("running inside the hold method");
    }

    @Override
    public String toString() {
        return "Bowl{" +"size=" + size + ", cost=" + cost + '}';
    }
}