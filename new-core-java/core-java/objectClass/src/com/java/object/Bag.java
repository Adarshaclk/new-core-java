package com.java.object;
import java.util.Objects;
public class Bag {

        private String matireal;
        private int cost;
        private boolean waterproof;
        private String brand;

        public Bag(String matireal, int cost, boolean waterproof, String brand) {
            this.matireal = matireal;
            this.cost = cost;
            this.waterproof = waterproof;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Bag{" +
                    "matireal='" + matireal + ", cost=" + cost +", water proof=" + waterproof + ", brand='" + brand  + '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Bag) {
                Bag other = (Bag) obj;
                if (Objects.equals(this.matireal, other.matireal) &&
                        Objects.equals(this.cost, other.cost)) {
                    System.out.println("Bag is matching..");
                    return true;
                }
            }
            return false;
        }
    }

