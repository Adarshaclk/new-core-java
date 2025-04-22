package com.java.inherMtd.internal;

public class Romeo {
    private String hero;
    private String heroine;
    public Romeo(String hero,String heroine){
        this.hero=hero;
        this.heroine=heroine;
        System.out.println("running inside the Romeo");
    }
    void romeo(){
        System.out.println("running inside the romeo");
    }

    @Override
    public String toString() {
        return "Romeo{" + "hero='" + hero + '\'' + ", heroine='" + heroine + '\'' + '}';
    }
}
