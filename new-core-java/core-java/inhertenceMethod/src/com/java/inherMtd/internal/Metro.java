package com.java.inherMtd.internal;

class Metro {
    private String name;
    private int stationsCount;

    protected Metro(String name, int stationsCount) {
        System.out.println("running inside the Metro CONST");
        this.name = name;
        this.stationsCount = stationsCount;
    }

    public void travel() {
        System.out.println("running inside the travel method");
    }

    @Override
    public String toString() {
        return "Metro{" +
                "name='" + name + '\'' +
                ", stationsCount=" + stationsCount +
                '}';
    }
}
