package org.java.encap.external;

import org.java.encap.internal.Postoffice;

public class Normal {
    public void nrml(){
    Postoffice postoffice=new Postoffice();
      System.out.println("name of the post is "+postoffice.getName());
        System.out.println("speed of the post is "+postoffice.getTime());
        System.out.println("cost of the post is "+postoffice.getCost());
        System.out.println("Govt of the post is "+postoffice.getGovt());
        System.out.println("is speed  post  "+postoffice.getSpeed());
}
}
