package com.java.object;

public class MissileRunner
{
    public static void main(String[] args) {

        Missile m1 = new Missile("Agni-V", "Ballistic", 5000.0, true);
        Missile m2 = new Missile("BrahMos", "Cruise", 290.0, false);
        Missile m3 = new Missile("BrahMos", "Cruise", 290.0, false);

        System.out.println("Missile 1: " + m1);
        System.out.println("Missile 2: " + m2);
        System.out.println("Missile 3: " + m3);

        boolean mMatch = m2.equals(m3);
        boolean mNotMatch = m1.equals(m2);
        System.out.println("Missile match: " + mMatch);
        System.out.println("Missile not match: " + mNotMatch);
    }
}
