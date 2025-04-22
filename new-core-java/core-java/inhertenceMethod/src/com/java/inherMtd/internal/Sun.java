package com.java.inherMtd.internal;

public class Sun {
    private int dist;
    private int temp;
     Sun(int dist,int temp){
         this.dist=dist;
         this.temp=temp;
         System.out.println("run");

     }
     public void slr(){
         System.out.println("running inside the slr");
     }

    @Override
    public String toString() {
        return "Sun{" + "dist=" + dist + ", temp=" + temp + '}';
    }
}
