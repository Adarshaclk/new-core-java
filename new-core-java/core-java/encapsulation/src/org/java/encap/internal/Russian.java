package org.java.encap.internal;

public class Russian {
    public Russian(){
        System.out.println("running inside the russian");
    }
    public void rsn(){
        Jet jet=new Jet();
        System.out.println("name of the jet is "+jet.getName());
        System.out.println("serial of the jet is "+jet.getSeir());
        System.out.println("speed of the jet is "+jet.getSpeed());
        System.out.println("counrty of the jet is "+jet.getCountry());
        System.out.println("height of the jet is "+jet.getHgt());

        jet.setName("rider");
        jet.setCountry("usa");
        jet.setHgt(6660);
        jet.setSeir(553);
        jet.setSpeed(390);

        System.out.println("name of the jet is "+jet.getName());
        System.out.println("serial of the jet is "+jet.getSeir());
        System.out.println("speed of the jet is "+jet.getSpeed());
        System.out.println("counrty of the jet is "+jet.getCountry());
        System.out.println("height of the jet is "+jet.getHgt());

    }
}
