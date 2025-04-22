package org.java.encap.internal;

public class Mutant {
    private String name="clave";
    private int heigt=12;
    private int width=22;
    private String nomenclature="simoClave";
    private int time=3;
    public Mutant(){
        System.out.println("running inside the Mutant const");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeigt(int heigt){
        this.heigt=heigt;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setNomenclature(String nomenclature){
        this.nomenclature=nomenclature;
    }
    public void setTime(int time){
        this.time=time;
    }
   public String getName(){
        return  this.name;
    }
    public int getHeigt(){
        return this.heigt;
    }
    public int getWidth(){
        return this.width;
    }
    public String getNomenclature(){
        return this.nomenclature;
    }
    public int getTime(){
        return this.time;
    }
}
