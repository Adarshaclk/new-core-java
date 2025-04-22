package com.java.inherMtd.internal;

public class Bedsheet {
    int lenght;
    int width;
    Bedsheet(int lenght,int width){
        System.out.println("running inside the Bedsheet");
    }
    void bdst(){
        System.out.println("running inside the bdst");
    }

    @Override
    public String toString() {
        return "Bedsheet{" + "lenght=" + lenght + ", width=" + width + '}';
    }
}
