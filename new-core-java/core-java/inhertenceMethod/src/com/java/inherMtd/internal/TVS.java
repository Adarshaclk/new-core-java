package com.java.inherMtd.internal;

public class TVS {
    private int serial;
    private String name;
    TVS(int serial,String name){
        this.serial=serial;
        this.name=name;
        System.out.println("runnning inside the tvs");
    }
    void tvs(){
        System.out.println("running inide tvs");
    }

    @Override
    public String toString() {
        return "TVS{" + "serial=" + serial + ", name='" + name + '\'' + '}';
    }
}
