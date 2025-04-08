package org.java.encap.external;

import org.java.encap.internal.KeyChain;

public class CarKey {

    public CarKey(){
        System.out.println("running insiede the carkey");
    }
    public void  car(){
        KeyChain keyChain=new KeyChain();
        System.out.println("the name of key chian is "+keyChain.getName());
        System.out.println("the lenght of the chain is "+keyChain.getLenght());
        System.out.println("the chain of the chain is "+keyChain.getChain());
        System.out.println("the color of the chain is "+keyChain.getColor());
        System.out.println("the smooth of the chain is "+keyChain.getSmmoth());
    }
}
