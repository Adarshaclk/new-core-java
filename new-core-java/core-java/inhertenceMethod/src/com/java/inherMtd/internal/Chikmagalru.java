package com.java.inherMtd.internal;

public class Chikmagalru {
    private String name;
    private double altitude;

    protected Chikmagalru(String name, double altitude) {
        System.out.println("running inside the Chikmagalru CONST");
        this.name = name;
        this.altitude = altitude;
    }

    public void ckmgr() {
        System.out.println("running inside the ckmgr method");
    }

    @Override
    public String toString() {
        return "Chikmagalru{" +
                "name='" + name + '\'' +
                ", altitude=" + altitude +
                '}';
    }
}
