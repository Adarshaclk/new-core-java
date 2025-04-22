package com.java.inherMtd.internal;

class Towel {
    private String matirl;
    private int size;
    protected Towel(String matirl,int size) {
        this.matirl=matirl;
        this.size=size;
        System.out.println("running inside the Towel CONST");
    }

    public void cloth() {
        System.out.println("running inside the cloth method");
    }
}
