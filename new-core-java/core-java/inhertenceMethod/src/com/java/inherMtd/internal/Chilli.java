package com.java.inherMtd.internal;

class Chilli {
    private String type;
    private int heatLevel;

    protected Chilli(String type, int heatLevel) {
        System.out.println("running inside the Chilli CONST");
        this.type = type;
        this.heatLevel = heatLevel;
    }

    void setChilli(String type, int heatLevel) {
        this.type = type;
        this.heatLevel = heatLevel;
    }

    public void spiceUp() {
        System.out.println("running inside the spiceUp method");
    }

    @Override
    public String toString() {
        return "Chilli{" + "type='" + type + '\'' + ", heatLevel=" + heatLevel + '}';
    }
}
