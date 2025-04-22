package com.java.inherMtd.internal;

class GoldChain {
    private int gms;
    private int carat;
    protected GoldChain(int gms,int carat) {
        this.carat=carat;
                this.gms=gms;
        System.out.println("running inside the GoldChain CONST");
    }

    public void shine() {
        System.out.println("running inside the shine method");
    }

    @Override
    public String toString() {
        return "GoldChain{" + "gms=" + gms + ", carat=" + carat + '}';
    }
}
