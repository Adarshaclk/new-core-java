package com.java.object;
import java.util.Objects;
public class Car {

    private String model;
    private int year;
    private boolean automatic;
    private String fuelType;

    public Car(String model, int year, boolean automatic, String fuelType) {
        this.model = model;
        this.year = year;
        this.automatic = automatic;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + ", year=" + year +", automatic=" + automatic + ", fuelType='" + fuelType  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Car) {
            Car other = (Car) obj;
            if (Objects.equals(this.model, other.model) &&
                    Objects.equals(this.year, other.year)) {
                System.out.println("Car is matching..");
                return true;
            }
        }
        return false;
    }
}
