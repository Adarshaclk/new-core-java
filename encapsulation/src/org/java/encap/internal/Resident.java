package org.java.encap.internal;

public class Resident {

    public Resident() {
        System.out.println("Running inside the Resident class");
    }

    public void showApartmentInfo() {
        Apartments apartment = new Apartments();
        System.out.println("Apartment Name: " + apartment.getName());
        System.out.println("Total Flats: " + apartment.getFlats());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Security Guards: " + apartment.getSecurityGuards());
        System.out.println("Parking Available: " + apartment.isParkingAvailable());


        apartment.setName("Lakeview Heights");
        apartment.setFlats(200);
        apartment.setLocation("Chennai");
        apartment.setSecurityGuards(8);
        apartment.setParkingAvailable(false);

        System.out.println("Updated Apartment Name: " + apartment.getName());
        System.out.println("Updated Total Flats: " + apartment.getFlats());
        System.out.println("Updated Location: " + apartment.getLocation());
        System.out.println("Updated Security Guards: " + apartment.getSecurityGuards());
        System.out.println("Updated Parking Available: " + apartment.isParkingAvailable());
    }
}
