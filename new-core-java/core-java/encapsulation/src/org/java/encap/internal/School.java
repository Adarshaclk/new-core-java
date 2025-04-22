package org.java.encap.internal;

public class School {
    public School(){
        System.out.println("running inside the Scool");
    }
    public void scl(){
        Badge badge=new Badge();
        System.out.println("name of the of the badge is "+badge.getName());
        System.out.println("length of the badge is "+badge.getLenght());
        System.out.println("width of the badge is "+badge.getWidth());
        System.out.println("matiral of the badge is "+badge.getMatirel());
        System.out.println("smooth of the badge is "+badge.getSmmoth());

        badge.setName("milatry");
        badge.setLenght(44);
        badge.setWidht(22);
        badge.setMatirel("metal");
        badge.setSmmoth(false);

        System.out.println("name of the of the badge is "+badge.getName());
        System.out.println("length of the badge is "+badge.getLenght());
        System.out.println("width of the badge is "+badge.getWidth());
        System.out.println("matiral of the badge is "+badge.getMatirel());
        System.out.println("smooth of the badge is "+badge.getSmmoth());

    }
}
