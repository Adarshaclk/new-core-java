package com.java.inherMtd.internal;

public class Iron extends Ore{
    Iron(){
        super(2,106);
        System.out.println("running inside the iron");
    }
    @Override
    void ore(){
        System.out.println("running inside the ore");
    }
    void iron(){
        System.out.println("running inside the iron");
    }

}
