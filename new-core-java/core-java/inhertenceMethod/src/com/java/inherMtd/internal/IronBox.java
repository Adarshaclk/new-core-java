package com.java.inherMtd.internal;

class IronBox {
    private  String type;
    private int maxheat ;
    protected IronBox(String type,int maxheat) {
        this.type=type;
        this.maxheat=maxheat;
        System.out.println("running inside the IronBox CONST");
    }

    public void heat() {
        System.out.println("running inside the heat method");
    }

    @Override
    public String toString() {
        return "IronBox{" + "type='" + type + '\'' + ", maxheat=" + maxheat + '}';
    }
}
