package com.java.inherMtd.internal;

public class Mari {
    private int bsct;
    private String flavr;
    Mari(int bsct,String flavr){
        System.out.println("running inside the Mari");
    }
    void mari(){
        System.out.println("running insidt thw mari");
    }

    @Override
    public String toString() {
        return "Mari{" + "bsct=" + bsct + ", flavr='" + flavr + '\'' + '}';
    }
}
