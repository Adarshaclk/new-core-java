package org.java.encap.internal;

public class Occupation {

    private String name="business";
    private String type="private";
    private int hrs=8;
    private int sal=90;
    private boolean peace=true;
    public Occupation(){
        System.out.println("runnig inside the job");
    }
    void setName(String name){
        this.name=name;
    }
    void setType(String type){
        this.type=type;
    }
    void setHrs(int hrs){
        this.hrs=hrs;
    }
    void setSal(int sal)
    {
        this.sal=sal;
    }
    void setPeace(boolean peace){
        this.peace=peace;
    }

    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getHrs(){
        return this.hrs;
    }
    public int getSal(){
        return this.sal;
    }
    public boolean getPeace(){
        return this.peace;
    }

}


