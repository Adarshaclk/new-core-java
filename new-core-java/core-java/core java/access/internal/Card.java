package com.java.access.internal;

public class Card {
    public Card(){
        System.out.println("running inside the Card const");
    }
    public void card()
    {    Debit debit=new Debit();
        debit.dbt();
        debit.dbt2();
    }
}
