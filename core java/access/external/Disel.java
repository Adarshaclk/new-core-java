package com.java.access.external;

public class Disel {
    public Disel(){
        System.out.println("running inside the desil const");
    }
     void disel(){
         System.out.println("running inside the desil default");
     }
     private void disel1(){
         System.out.println("running inside the desil private");
     }
     public void disel2(){
         System.out.println("running inside the desil public ");
         disel1();
     }

}
