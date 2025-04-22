package org.java.encap.external;

import org.java.encap.internal.Jet;

public class USA {
    public USA(){
        System.out.println("runningn inside the usa");
    }

    public void usa() {
        Jet jet=new Jet();
        System.out.println("name of the jet is " + jet.getName());
        System.out.println("serial of the jet is " + jet.getSeir());
        System.out.println("speed of the jet is " + jet.getSpeed());
        System.out.println("counrty of the jet is " + jet.getCountry());
        System.out.println("height of the jet is " + jet.getHgt());
    }
}
