package org.java.encap.internal;

public class SpiderKey {
    public SpiderKey(){
        System.out.println("running insode the spider");
    }
  public   void spidy(){
        KeyChain keyChain=new KeyChain();
        System.out.println("the name of key chian is "+keyChain.getName());
        System.out.println("the lenght of the chain is "+keyChain.getLenght());
        System.out.println("the chain of the chain is "+keyChain.getChain());
        System.out.println("the color of the chain is "+keyChain.getColor());
        System.out.println("the smooth of the chain is "+keyChain.getSmmoth());

        keyChain.setName("car");
        keyChain.setLenght(54);
        keyChain.setChain(4);
        keyChain.setColor("black");
        keyChain.setSmmoth(false);

        System.out.println("the name of key chian is "+keyChain.getName());
        System.out.println("the lenght of the chain is "+keyChain.getLenght());
        System.out.println("the chain of the chain is "+keyChain.getChain());
        System.out.println("the color of the chain is "+keyChain.getColor());
        System.out.println("the smooth of the chain is "+keyChain.getSmmoth());




    }
}
