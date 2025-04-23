package com.java.multintrfce;

public class MNCco implements Google,Microsoft,MNC{

    public void mnc(){
        System.out.println("running inside the MNCco");
    }

    @Override
   public void corporate(){
        System.out.println("running inside the coporate");
    }

}
