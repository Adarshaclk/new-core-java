package org.java.encap.internal;

public class Gym {
    private String name = "Gold's Gym";
    private int equipmentCount = 25;
    private String location = "Mumbai";
    private int trainers = 5;
    private boolean open24Hours = true;

    public Gym() {
        System.out.println("Running inside the Gym constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEquipmentCount(int equipmentCount) {
        this.equipmentCount = equipmentCount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTrainers(int trainers) {
        this.trainers = trainers;
    }

    public void setOpen24Hours(boolean open24Hours) {
        this.open24Hours = open24Hours;
    }

    public String getName() {
        return this.name;
    }

    public int getEquipmentCount() {
        return this.equipmentCount;
    }

    public String getLocation() {
        return this.location;
    }

    public int getTrainers() {
        return this.trainers;
    }

    public boolean isOpen24Hours() {
        return this.open24Hours;
    }
}