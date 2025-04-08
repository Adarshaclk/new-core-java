package com.java.access.internal;

import com.java.access.external.TempleTrust;

public class Temple {
     public Temple(){
         System.out.println("running inside const Temple");
     }

     public void temp(){
         GodTemple godTemple=new GodTemple();
         godTemple.god();
         godTemple.god2();

     }
}
