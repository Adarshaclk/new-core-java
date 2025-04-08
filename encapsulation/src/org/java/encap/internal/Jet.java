package org.java.encap.internal;

public class Jet {
    private String name="fighter";
    private int seir=4040;
    private String country="russian";
    private int  speed =244;
    private int hgt=3850;

    public Jet(){
        System.out.println("running inside the jet");
    }
    void setName(String name){
        this.name=name;
    }
    void setSeir(int seir){
        this.seir=seir;
    }
    void setCountry(String country){
        this.country=country;
    }
    void setSpeed(int speed){
        this.speed=speed;
    }
    void setHgt(int hgt){
        this.hgt=hgt;
    }
    public String getName(){
        return this.name;
    }
    public int getSeir(){
        return this.seir;
    }
    public int getSpeed(){
        return this.speed;
    }
    public String getCountry(){
        return this.country;
    }
    public int getHgt(){
        return this.hgt;
    }
}
