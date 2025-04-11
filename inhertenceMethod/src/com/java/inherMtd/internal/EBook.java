package com.java.inherMtd.internal;
class EBook extends Book {
    public EBook() {
        System.out.println("running inside the EBook CONST");
    }

    public void download() {
        System.out.println("running inside the download method");
    }

    @Override
    public void read() {
        System.out.println("overridden read method in EBook");
    }
}