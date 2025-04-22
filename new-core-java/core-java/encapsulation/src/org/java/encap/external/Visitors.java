package org.java.encap.external;

import org.java.encap.internal.Apartments;

public class Visitors {
    public Visitors() {
        System.out.println("Running inside the Visitor class");
    }

    public void viewApartmentDetails() {
        Apartments apartment = new Apartments();
        System.out.println("Apartment Name: " + apartment.getName());
        System.out.println("Total Flats: " + apartment.getFlats());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Security Guards: " + apartment.getSecurityGuards());
        System.out.println("Parking Available: " + apartment.isParkingAvailable());
    }
}
