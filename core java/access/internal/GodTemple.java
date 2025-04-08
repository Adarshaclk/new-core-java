package com.java.access.internal;

public class GodTemple {
    GodTemple(){

    }
    void god2(){
        System.out.println("running inside default the Godtemple");
    }
    public void  god(){
        System.out.println("running inside public the Godtemple");
        god1();
    }
    private void god1() {
        System.out.println("running inside private the Godtemple");
    }


}

