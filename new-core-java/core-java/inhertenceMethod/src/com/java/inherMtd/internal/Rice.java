package com.java.inherMtd.internal;

class Rice {
    private String type;
    private int price;

    protected Rice(String type, int price) {
        System.out.println("running inside the Rice CONST");
    }
    void setType(String type,int price){
        this.type=type;
        this.price=price;
    }

    public void cook() {
        System.out.println("running inside the cook method");
    }

    @Override
    public String toString() {
        return "Rice{" + "type='" + type + '\'' + ", price=" + price + '}';
    }
}
