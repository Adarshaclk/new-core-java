package gov.java.inheri.external;

import gov.java.inheri.internal.Omlete;
import gov.java.inheri.internal.SideDish;

public class Dish extends SideDish {
    protected Dish(){
        System.out.println(" Omlete is sideDish");
    }
    void omlt(){
        Omlete omlete=new Dish();
    }
}
