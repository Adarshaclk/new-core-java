package com.java.exception.colour;

import com.java.exception.exceptions.ColorCodeMissmatch;

import java.util.Scanner;

public class Colour {
    public static void main(String[] args) {
        int[] col = {12, 23, 13, 34, 67, 22};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color code:");
        int color = scanner.nextInt();
        boolean matched = false;
        try {
            for (int i = 0; i < col.length; i++) {
                if (col[i] == color) {
                    matched = true;
                    break;
                }
            }
            if (matched) {
                System.out.println("Color code matched.");
            } else {
                throw new ColorCodeMissmatch("Color code not found in the list.");
            }
        } catch (ColorCodeMissmatch e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            scanner.close();
        }

    }
}
