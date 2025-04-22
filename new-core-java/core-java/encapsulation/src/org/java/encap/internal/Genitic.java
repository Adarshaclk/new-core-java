package org.java.encap.internal;

public class Genitic {

    public Genitic() {
        System.out.println("running inside the Genitic");

    }

    public void gen() {
        Mutant mutant = new Mutant();
        System.out.println("name of mutant is " + mutant.getName());
        System.out.println("heright of the mutuant " + mutant.getHeigt());
        System.out.println("width of the mutant " + mutant.getWidth());
        System.out.println("nomencaltue is " + mutant.getNomenclature());
        System.out.println("time :" + mutant.getTime());

        mutant.setName("enclave");
        mutant.setHeigt(44);
        mutant.setWidth(55);
        mutant.setNomenclature("sdfasdv");
        mutant.setTime(90);

        System.out.println("name of mutant is " + mutant.getName());
        System.out.println("heright of the mutuant " + mutant.getHeigt());
        System.out.println("width of the mutant " + mutant.getWidth());
        System.out.println("nomencaltue is " + mutant.getNomenclature());
        System.out.println("time :" + mutant.getTime());

    }
}