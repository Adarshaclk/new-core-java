package com.java.object;
import java.util.Objects;
public class Aircraft {

    private String model;
    private String manufacturer;
    private int capacity;
    private boolean isCommercial;

    public Aircraft(String model, String manufacturer, int capacity, boolean isCommercial) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.isCommercial = isCommercial;
    }
    @Override
    public String toString() {
        return "Aircraft{" +
                "model='" + model + ", manufacturer='" + manufacturer + "', capacity=" + capacity + ", isCommercial=" + isCommercial + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Aircraft) {
            Aircraft other = (Aircraft) obj;
            if (Objects.equals(this.model, other.model) &&
                    Objects.equals(this.manufacturer, other.manufacturer)) {
                System.out.println("Aircraft is matching..");
                return true;
            }
        }
        return false;
    }
}
