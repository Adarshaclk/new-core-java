package com.java.inherMtd.internal;

class Missile {
    private String name;
    private int range;
    protected Missile(String name,int range) {
        this.name=name;
        this.range=range;
        System.out.println("running inside the Missile CONST");
    }

    public void launch() {
        System.out.println("running inside the launch method");
    }

    @Override
    public String toString() {
        return "Missile{" + "name='" + name + '\'' + ", range=" + range + '}';
    }
}
