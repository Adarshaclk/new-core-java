package org.java.encap.external;

import org.java.encap.internal.Gym;

public class Trainer {
    public Trainer() {
        System.out.println("Running inside the Trainer class");
    }

    public void trainerInfo() {
        Gym gym = new Gym();
        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Equipment Count: " + gym.getEquipmentCount());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Number of Trainers: " + gym.getTrainers());
        System.out.println("Open 24 Hours: " + gym.isOpen24Hours());
    }
}
