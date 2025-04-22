package com.java.inherMtd.internal;

class Train {
    private String model;
    private int speed;

    protected Train(String model, int speed) {
        System.out.println("running inside the Train CONST");
        this.model = model;
        this.speed = speed;
    }

    void setTrain(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void move() {
        System.out.println("running inside the move method");
    }

    @Override
    public String toString() {
        return "Train{" + "model='" + model + '\'' + ", speed=" + speed + " km/h}";
    }
}
