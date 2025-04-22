package com.java.object;

public class BoardRunner
{
    public static void main(String[] args) {

        Board b1 = new Board("Wood", 100.0, "Whiteboard", true);
        Board b2 = new Board("Plastic", 80.0, "Noticeboard", false);
        Board b3 = new Board("Plastic", 80.0, "Noticeboard", false);

        System.out.println("Board 1: " + b1);
        System.out.println("Board 2: " + b2);
        System.out.println("Board 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Board match: " + bMatch);
        System.out.println("Board not match: " + bNotMatch);
    }
}
