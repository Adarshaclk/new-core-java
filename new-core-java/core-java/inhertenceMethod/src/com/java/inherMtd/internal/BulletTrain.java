package com.java.inherMtd.internal;

class BulletTrain extends Train {
    public BulletTrain() {
        super("Shinkansen", 320);
        System.out.println("running inside the BulletTrain CONST");
    }

    public void highSpeed() {
        System.out.println("running inside the highSpeed method");
    }

    @Override
    public void move() {
        System.out.println("overridden move method in BulletTrain");
    }
}
