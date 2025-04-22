package com.java.inherMtd.internal;

public class Alchol {
    int quant;
    String brand;
    Alchol(int quant,String brand){
        this.quant=quant;
        this.brand=brand;
        System.out.println("running inide the Alchol const");
    }
    void alc(){
        System.out.println("running inisde the alc");
    }

    @Override
    public String toString() {
        return "Alchol{" + "quant=" + quant + ", brand='" + brand + '\'' + '}';
    }
}
