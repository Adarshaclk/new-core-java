package com.java.access.internal;

import com.java.access.external.Tails;

public class Coin {
   public Coin(){
       System.out.println("running inside const of coins");
   }
   public void coin(){
       Heads head=new Heads();
       head.head();
       head.head2();

   }
}
