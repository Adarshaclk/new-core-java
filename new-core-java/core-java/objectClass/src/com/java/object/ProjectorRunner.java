package com.java.object;

public class ProjectorRunner
{
    public static void main(String[] args) {

        Projector p1 = new Projector("Epson", "1080p", 3000, true);
        Projector p2 = new Projector("BenQ", "720p", 2500, false);
        Projector p3 = new Projector("BenQ", "720p", 2500, false);

        System.out.println("Projector 1: " + p1);
        System.out.println("Projector 2: " + p2);
        System.out.println("Projector 3: " + p3);

        boolean pMatch = p2.equals(p3);
        boolean pNotMatch = p1.equals(p2);
        System.out.println("Projector match: " + pMatch);
        System.out.println("Projector not match: " + pNotMatch);
    }
}
