package com.java.inherMtd.internal;

class Milk {
    private String type;
    private double quantity;

    protected Milk(String type, double quantity) {
        System.out.println("running inside the Milk CONST");
        this.type = type;
        this.quantity = quantity;
    }

    void setMilk(String type, double quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public void drink() {
        System.out.println("running inside the drink method");
    }

    @Override
    public String toString() {
        return "Milk{" + "type='" + type + '\'' + ", quantity=" + quantity + "L}";
    }
}
