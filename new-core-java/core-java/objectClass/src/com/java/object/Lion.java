package com.java.object;
import java.util.Objects;
public class Lion {

    private String name;
    private int age;
    private double weight;
    private boolean isWild;

    public Lion(String name, int age, double weight, boolean isWild) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isWild = isWild;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + ", age=" + age + ", weight=" + weight + ", isWild=" + isWild + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lion) {
            Lion other = (Lion) obj;
            if (Objects.equals(this.name, other.name) &&
                    this.isWild == other.isWild) {
                System.out.println("Lion is matching..");
                return true;
            }
        }
        return false;
    }
}
