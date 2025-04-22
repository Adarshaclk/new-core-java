package com.java.object;
import java.util.Objects;
public class Laptop {

    private String processor;
    private int ram;
    private boolean ssd;
    private String brand;

    public Laptop(String processor, int ram, boolean ssd, String brand) {
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + ", ram=" + ram +", ssd=" + ssd + ", brand='" + brand  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Laptop) {
            Laptop other = (Laptop) obj;
            if (Objects.equals(this.processor, other.processor) &&
                    Objects.equals(this.ram, other.ram)) {
                System.out.println("Laptop is matching..");
                return true;
            }
        }
        return false;
    }
}
