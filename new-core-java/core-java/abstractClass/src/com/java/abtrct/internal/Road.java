package com.java.abtrct.internal;

public class Road extends AbstractRoad {

    public Road() {
        System.out.println("Running inside no-arg constructor of Road");
    }

    public Road(String name) {
        System.out.println("Running inside parameterized constructor of Road. Road name: " + name);
    }

    public void rd() {
        System.out.println("Running inside rd()");
    }

    @Override
    public void nh() {
        System.out.println("Running inside nh() - Highway name: " + this.name);
    }
}
