package com.java.inherMtd.internal;

class Tank {
    private String type;
    private int range;
    protected Tank(String type,int range) {
        this.range=range;
        this.type=type;
        System.out.println("running inside the Tank CONST");
    }

    public void fire() {
        System.out.println("running inside the fire method");
    }

    @Override
    public String toString() {
        return "Tank{" + "type='" + type + '\'' + ", range=" + range + '}';
    }
}