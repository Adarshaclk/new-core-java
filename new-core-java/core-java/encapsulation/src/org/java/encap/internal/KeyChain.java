package org.java.encap.internal;

public class KeyChain {
    private String name="spider";
    private int lenght=43;
    private int chain=2;
    private String color="red";
    private boolean smmoth=true;

    public KeyChain(){
        System.out.println("running inside the Keychain");
    }
    void setName(String name) {
        this.name = name;
    }
     void setLenght(int lenght) {
        this.lenght = lenght;
    }
     void setChain(int chain) {
        this.chain = chain;
    }
     void setColor(String color){
        this.color=color;
    }
     void setSmmoth(boolean smmoth) {
        this.color = color;
    }
     public String getName(){
        return this.name;
    }
    public int getLenght(){
        return this.lenght;
    }
    public int getChain(){
     return this.chain;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getSmmoth(){
        return this.smmoth;
    }
}
