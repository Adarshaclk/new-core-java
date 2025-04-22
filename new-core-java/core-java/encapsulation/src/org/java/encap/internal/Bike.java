package org.java.encap.internal;

public class Bike {
    public Bike(){
        System.out.println("running inside the bike");
    }
    public void bke(){
        Garage garage=new Garage();
        System.out.println("name of the of the garage is "+garage.getName());
        System.out.println("number of bike in the garage is "+garage.getBike());
        System.out.println("number of employee in the garage is "+garage.getEmp());
        System.out.println("location of bike in the garage is "+garage.getLoc());
        System.out.println("is spers of bike in the garage  "+garage.getSper());

        garage.setName("car");
        garage.setBike(34);
        garage.setLoc("chennai");
        garage.setEmp(44);
        garage.setSper(false);

        System.out.println("name of the of the garage is "+garage.getName());
        System.out.println("number of bike in the garage is "+garage.getBike());
        System.out.println("number of employee in the garage is "+garage.getEmp());
        System.out.println("location of bike in the garage is "+garage.getLoc());
        System.out.println("is spers of bike in the garage  "+garage.getSper());
    }
}
