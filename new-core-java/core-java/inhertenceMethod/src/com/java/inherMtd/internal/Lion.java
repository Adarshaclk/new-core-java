package com.java.inherMtd.internal;

public class Lion {
    private boolean pet;
    private String food;
    Lion(boolean pet,String food){
        this.pet=pet;
        this.food=food;
        System.out.println("running inside the Lion");
    }
    void lion(){
        System.out.println("running inisde the lion");
    }

    @Override
    public String toString() {
        return "Lion{" + "pet=" + pet + ", food='" + food + '\'' + '}';
    }
}
