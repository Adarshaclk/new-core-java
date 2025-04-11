package com.java.inherMtd.internal;

class Film {
    protected Film() {
        System.out.println("running inside the Film CONST");
    }

    public void play() {
        System.out.println("running inside the play method");
    }
}