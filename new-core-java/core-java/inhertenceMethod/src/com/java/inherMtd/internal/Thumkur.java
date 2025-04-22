package com.java.inherMtd.internal;

public class Thumkur {
    private String name;
    private int popl;
    Thumkur(String name,int popl){
        this.name=name;
        this.popl=popl;
        System.out.println("running inside the Thumkur");
    }
    void tmkr(){
        System.out.println("running inisde the tkr");
    }

    @Override
    public String toString() {
        return "Thumkur{" + "name='" + name + '\'' + ", popl=" + popl + '}';
    }
}
