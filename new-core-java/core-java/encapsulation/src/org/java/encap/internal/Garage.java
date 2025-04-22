package org.java.encap.internal;

public class Garage {
    private String name="bike";
    private int bike=43;
    private String loc="benglore";
    private int emp=9;
    private boolean sper=true;

    public Garage(){
        System.out.println("unningn insid the garage ");
    }
    void setName(String name){
        this.name=name;
    }
    void setBike(int bike){
        this.bike=bike;
    }
    void setLoc(String loc){
        this.loc=loc;
    }
    void setEmp(int emp){
        this.emp=emp;
    }
    void setSper(boolean sper){
        this.sper=sper;
    }
    public String getName(){
        return this.name;
    }

    public int getBike() {
        return this.bike;
    }

    public int getEmp() {
        return this.emp;
    }
    public boolean getSper(){
        return this.sper;
    }
    public String getLoc(){
        return this.loc;
    }
}
