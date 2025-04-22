package org.java.encap.internal;

public class Business {

    public Business(){
        System.out.println("running inside the Business");
    }
    public void bns(){
        Occupation occupation=new Occupation();
        System.out.println("name of the occupation is "+occupation.getName());
        System.out.println("type of the occupation is "+occupation.getType());
        System.out.println("salary of the occupation is "+occupation.getSal());
        System.out.println("hrs of the occupation is "+occupation.getHrs());
        System.out.println("peace of the occupation is "+occupation.getPeace());

        occupation.setName("job");
        occupation.setHrs(10);
        occupation.setSal(70);
        occupation.setType("private");
        occupation.setPeace(false);

        System.out.println("name of the occupation is "+occupation.getName());
        System.out.println("type of the occupation is "+occupation.getType());
        System.out.println("salary of the occupation is "+occupation.getSal());
        System.out.println("hrs of the occupation is "+occupation.getHrs());
        System.out.println("peace of the occupation is "+occupation.getPeace());


    }
}
