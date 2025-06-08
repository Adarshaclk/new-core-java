package com.java.exception.ingrideant;

import java.util.Scanner;

public class Ingridieant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of ingredients:");
        int count = scanner.nextInt();
        scanner.nextLine();
        String[] ingredients = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter ingredient " + (i + 1) + ": ");
            ingredients[i] = scanner.nextLine();
        }
        System.out.println("\nIngredients you entered:");
        for (String item : ingredients) {
            System.out.println(item);
        }
        try {
            System.out.println("Selected item: " + ingredients[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("22 Error: Tried to access invalid index.");
            System.out.println("Exception: " + e.getMessage());
        }
finally {
            scanner.close();
        }

    }
}
