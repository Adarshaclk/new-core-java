package com.java.abtrct.internal;

public abstract class AbstractRoad {
    String name;

    public AbstractRoad() {
        System.out.println("Running inside no-arg constructor of AbstractRoad");
    }

    public AbstractRoad(String name) {
        this.name = name;
        System.out.println("Running inside parameterized constructor of AbstractRoad. Highway is: " + name);
    }

    public abstract void nh();
}
