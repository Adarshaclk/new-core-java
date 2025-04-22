package org.java.encap.internal;

public class Apartments {
    private String name = "Skyline Residency";
    private int flats = 120;
    private String location = "Hyderabad";
    private int securityGuards = 5;
    private boolean parkingAvailable = true;

    public Apartments() {
        System.out.println("Running inside the Apartment constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlats(int flats) {
        this.flats = flats;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSecurityGuards(int securityGuards) {
        this.securityGuards = securityGuards;
    }

    public void setParkingAvailable(boolean parkingAvailable) {
        this.parkingAvailable = parkingAvailable;
    }

    public String getName() {
        return this.name;
    }

    public int getFlats() {
        return this.flats;
    }

    public String getLocation() {
        return this.location;
    }

    public int getSecurityGuards() {
        return this.securityGuards;
    }

    public boolean isParkingAvailable() {
        return this.parkingAvailable;
    }
}
