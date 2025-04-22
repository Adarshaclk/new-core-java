package com.java.access.external;

public class TempleTrust {
  public  TempleTrust(){
        System.out.println("running inside the deafult temple Temple Trust");

    }
    void templeTrust(){
        System.out.println("running inside default the Temple Trust");
    }
     public void templeTrust1(){
         System.out.println("running inside public  the Temple Trust");
         templeTrust2();
     }
     private void templeTrust2(){
         System.out.println("running inside private the Temple Trust");
     }

    }
