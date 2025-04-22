package com.java.access.external;

public class Credit {
    public Credit() {
        System.out.println("running inside the credit cont");

    }

    void crd() {
        System.out.println("running inside the Card default");
    }

    private void crd1() {
        System.out.println("running inside the Card private");
    }

    public void crd2() {
        System.out.println("running inside the Card public");
        crd1();
    }
}