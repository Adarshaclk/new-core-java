package com.java.inherMtd.internal;

class Book {
    protected Book() {
        System.out.println("running inside the Book CONST");
    }

    public void read() {
        System.out.println("running inside the read method");
    }
}