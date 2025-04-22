package com.java.inherMtd.internal;

public class Navagraha {
    private int cast;
    private int year;
    Navagraha(int cast,int year){
        this.cast=cast;
        this.year=year;
        System.out.println("running inside the navagraha");
    }
    void nava(){
        System.out.println("running inside nava");
    }

    @Override
    public String toString() {
        return "Navagraha{" + "cast=" + cast + ", year=" + year + '}';
    }
}
