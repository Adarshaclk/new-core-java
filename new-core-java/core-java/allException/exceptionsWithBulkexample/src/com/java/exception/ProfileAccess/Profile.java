package com.java.exception.ProfileAccess;

import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the nick name:");
        String name = scanner.nextLine();

        try {
            if (name ==null || name.trim().isEmpty()) {
                throw new NullPointerException("Nickname is empty or null.");
            } else {
                System.out.println("Nick name is: " + name);
            }
        } catch (NullPointerException e) {
            System.out.println("Name contains null or is empty → " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
