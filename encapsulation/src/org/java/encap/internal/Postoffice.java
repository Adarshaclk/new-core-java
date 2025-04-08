package org.java.encap.internal;

public class Postoffice {
    private String name="Speed";
    private  int time=24;
    private int cost=50;
    private String govt="central";
    private boolean speed=true;

    public Postoffice(){
        System.out.println("running inside the post office");
    }
    void setName(String name){
        this.name=name;
    }
    void setTime(int time){
        this.time=time;
    }
    void setCost(int cost){
        this.cost=cost;
    }
    void setGovt(String govt){
        this.govt=govt;
    }
    void setSpeed(boolean speed){
        this.speed=speed;
    }

    public String getName(){
        return this.name;
    }
    public int getTime(){
        return this.time;
    }
    public int getCost(){
        return  this.cost;
    }
    public String getGovt(){
        return this.govt;
    }
    public boolean getSpeed(){
        return this.speed;
    }

}
