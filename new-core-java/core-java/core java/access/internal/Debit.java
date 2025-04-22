package com.java.access.internal;

public class Debit {
    public Debit(){
        System.out.println("running inside the Debit const");
    }
    void dbt(){
        System.out.println("running inside the Debit default");
    }
    private void dbt1(){
        System.out.println("running inside the Debit private");
    }
    public void dbt2()
    {
        System.out.println("running inside the Debit public");
        dbt1();
    }
}
