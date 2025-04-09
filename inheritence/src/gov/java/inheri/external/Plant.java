package gov.java.inheri.external;

import gov.java.inheri.internal.Cactus;

import gov.java.inheri.internal.Thing;

public class Plant extends Thing {
    protected Plant(){
        System.out.println(", plant is thing");
    }
    void plt(){
        Cactus cactus=new Plant();
    }
}
