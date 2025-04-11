package com.java.inherMtd.internal;
class DocumentaryFilm extends Film {
    public DocumentaryFilm() {
        System.out.println("running inside the DocumentaryFilm CONST");
    }
    public void educate() {
        System.out.println("running inside the educate method");
    }
    @Override
    public void play() {
        System.out.println("overridden play method in DocumentaryFilm");
    }
}