package org.java.encap.external;

import org.java.encap.internal.Mutant;

public class Disorder {
    public Disorder(){
        System.out.println("running inisde the disorder");
    }
    public void dis() {
        Mutant mutant = new Mutant();
        System.out.println("the name of the disorder is "+mutant.getName());
        System.out.println("the hegith of the disorder is"+mutant.getHeigt());
        System.out.println("the width of the disorder is"+mutant.getWidth());
        System.out.println("the nomenculture of the disorder is "+mutant.getNomenclature());
        System.out.println("the time of the disorder is "+mutant.getTime());

    }
    }
