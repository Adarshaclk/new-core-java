package com.java.exception.video;

import com.java.exception.exceptions.CompatableException;

import java.util.Scanner;

public class Video {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ramOptions = {8, 16, 32};
        int[] resOptions = {128, 480, 720, 1080};

        System.out.println("Do you have a graphics card? (true/false):");
        boolean hasGraphicsCard = scanner.nextBoolean();

        int userRam = 0;
        int userRes = 0;

        try {
            System.out.println("Enter your device RAM (8, 16, 32): ");
            userRam = scanner.nextInt();

            boolean ramSupported = false;
            for (int ram : ramOptions) {
                if (ram == userRam) {
                    ramSupported = true;
                    break;
                }
            }

            if (!ramSupported) {
                throw new CompatableException("Unsupported RAM: " + userRam);
            } else {
                System.out.println(userRam + " GB RAM is supported.");
            }
            try {
                System.out.println("Enter resolution you require (128, 480, 720, 1080): ");
                userRes = scanner.nextInt();

                boolean resSupported = false;
                for (int res : resOptions) {
                    if (res == userRes) {
                        resSupported = true;
                        break;
                    }
                }

                if (!resSupported) {
                    throw new CompatableException("Unsupported resolution: " + userRes);
                } else {
                    System.out.println(userRes + "p resolution is supported.");
                }

            } catch (CompatableException e) {
                System.out.println(" Resolution Error: " + e.getMessage());
            }

        } catch (CompatableException e) {
            System.out.println(" RAM Error: " + e.getMessage());
        }
        if ((userRam == 8 && userRes == 128 && !hasGraphicsCard) ||
                (userRam == 16 && userRes == 480 && hasGraphicsCard) ||
                (userRam == 32 && userRes == 720 && hasGraphicsCard) ||
                (userRam == 32 && userRes == 1080 && hasGraphicsCard)) {
            System.out.println(" Video can be easily played at " + userRes + "p.");
        } else {
            System.out.println("Video may not play smoothly on your device.");
        }

        scanner.close();
    }
}
