package com.java.inherMtd.internal;

public class Sudeep {
    private String hero;
    private String movie;
    Sudeep(String movie,String hero){
        this.movie=movie;
        this.hero=hero;
        System.out.println("running insie the sudeep");
    }
    void sude(){
        System.out.println("running inside the sude");
    }

    @Override
    public String toString() {
        return "Sudeep{" + "hero='" + hero + '\'' + ", movie='" + movie + '\'' + '}';
    }
}
