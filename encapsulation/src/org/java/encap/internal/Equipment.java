package org.java.encap.internal;

public class Equipment {
    public Equipment() {
        System.out.println("Running inside the Equipment class");
    }

    public void showDetails() {
        Gym gym = new Gym();
        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Equipment Count: " + gym.getEquipmentCount());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Number of Trainers: " + gym.getTrainers());
        System.out.println("Open 24 Hours: " + gym.isOpen24Hours());


        gym.setName("Anytime Fitness");
        gym.setEquipmentCount(40);
        gym.setLocation("Delhi");
        gym.setTrainers(10);
        gym.setOpen24Hours(false);

        System.out.println("Updated Gym Name: " + gym.getName());
        System.out.println("Updated Equipment Count: " + gym.getEquipmentCount());
        System.out.println("Updated Location: " + gym.getLocation());
        System.out.println("Updated Number of Trainers: " + gym.getTrainers());
        System.out.println("Updated Open 24 Hours: " + gym.isOpen24Hours());
    }
}
