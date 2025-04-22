package com.java.object;
import java.util.Objects;
public class CarChief {

    private String name;
    private int experienceYears;
    private String specialization;
    private boolean isCertified;

    public CarChief(String name, int experienceYears, String specialization, boolean isCertified) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.specialization = specialization;
        this.isCertified = isCertified;
    }

    @Override
    public String toString() {
        return "CarChief{" +
                "name='" + name + ", experienceYears=" + experienceYears + ", specialization='" + specialization + "', isCertified=" + isCertified + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof CarChief) {
            CarChief other = (CarChief) obj;
            if (Objects.equals(this.name, other.name) &&
                    Objects.equals(this.specialization, other.specialization)) {
                System.out.println("CarChief is matching..");
                return true;
            }
        }
        return false;
    }
}
