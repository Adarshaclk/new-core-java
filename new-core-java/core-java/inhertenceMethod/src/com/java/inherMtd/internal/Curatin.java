package com.java.inherMtd.internal;

class Curtain {
    private String type;
    private String clr;
    protected Curtain(String type,String clr) {
        this.type=type;
        this.clr=clr;
        System.out.println("running inside the Curtain CONST");
    }

    public void fabric() {
        System.out.println("running inside the fabric method");
    }

    @Override
    public String toString() {
        return "Curtain{" + "type='" + type + '\'' + ", clr='" + clr + '\'' + '}';
    }
}
