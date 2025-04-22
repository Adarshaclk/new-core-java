package org.java.encap.external;

import org.java.encap.internal.Occupation;

public class Job {
    public Job() {
        System.out.println("running inside the job");
    }

    public void jb() {
        Occupation occupation=new Occupation();
        System.out.println("name of the occupation is " + occupation.getName());
        System.out.println("type of the occupation is " + occupation.getType());
        System.out.println("salary of the occupation is " + occupation.getSal());
        System.out.println("hrs of the occupation is " + occupation.getHrs());
        System.out.println("peace of the occupation is " + occupation.getPeace());

    }
}