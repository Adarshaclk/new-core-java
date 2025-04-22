package com.java.object;
import java.util.Objects;
public class Cat {

    private String name;
    private String breed;
    private int age;
    private boolean isIndoor;

    public Cat(String name, String breed, int age, boolean isIndoor) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isIndoor = isIndoor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + ", breed='" + breed + "', age=" + age + ", isIndoor=" + isIndoor + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cat) {
            Cat other = (Cat) obj;
            if (Objects.equals(this.name, other.name) &&
                    Objects.equals(this.breed, other.breed)) {
                System.out.println("Cat is matching..");
                return true;
            }
        }
        return false;
    }
}
