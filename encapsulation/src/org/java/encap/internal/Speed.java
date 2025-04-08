package org.java.encap.internal;

public class Speed {
    public Speed(){
        System.out.println("running inside the speed ");
    }
    public void spd(){
        Postoffice postoffice=new Postoffice();
        System.out.println("name of the post is "+postoffice.getName());
        System.out.println("speed of the post is "+postoffice.getTime());
        System.out.println("cost of the post is "+postoffice.getCost());
        System.out.println("Govt of the post is "+postoffice.getGovt());
        System.out.println("is speed  post  "+postoffice.getSpeed());

        postoffice.setName("normal");
        postoffice.setTime(48);
        postoffice.setCost(12);
        postoffice.setSpeed(false);
        postoffice.setGovt("state");


        System.out.println("name of the post is "+postoffice.getName());
        System.out.println("speed of the post is "+postoffice.getTime());
        System.out.println("cost of the post is "+postoffice.getCost());
        System.out.println("Govt of the post is "+postoffice.getGovt());
        System.out.println("is speed  post  "+postoffice.getSpeed());

    }
}
