package com.java.object;

public class CarRunner
{
    public static void main(String[] args) {

        Car c1 = new Car("Swift", 2022, true, "Petrol");
        Car c2 = new Car("Creta", 2023, false, "Diesel");
        Car c3 = new Car("Creta", 2023, false, "Diesel");

        System.out.println("Car 1: " + c1);
        System.out.println("Car 2: " + c2);
        System.out.println("Car 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Car match: " + cMatch);
        System.out.println("Car not match: " + cNotMatch);



    }
}
