package com.java.inherMtd.internal;

class Bow {
    private String type;
    private int arrow;
    protected Bow(String type,int arrow) {
        this.arrow=arrow;
        this.type=type;
        System.out.println("running inside the Bow CONST");
    }

    public void shoot() {
        System.out.println("running inside the shoot method");
    }

    @Override
    public String toString() {
        return "Bow{" + "type='" + type + '\'' + ", arrow=" + arrow + '}';
    }
}