package com.java.inherMtd.internal;

class Table {
    private int legs;
    private String type;
    protected Table(int legs,String type) {
        this.legs=legs;
        this.type=type;
        System.out.println("running inside the Table CONST");
    }

    public void furniture() {
        System.out.println("running inside the furniture method");
    }

    @Override
    public String toString() {
        return "Table{" + "legs=" + legs + ", type='" + type + '\'' + '}';
    }
}