package com.java.exception.game;

import com.java.exception.exceptions.InvaliedOptionExeption;

import java.util.Scanner;

public class GameMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a valid option to select:");
        System.out.println(" -> a. Temple Run");
        System.out.println(" -> b. Subway Surf");
        System.out.println(" -> c. Angry Birds");
        System.out.println(" -> d. Blue Whale");

        String op = scanner.next();

        try {
            if (!op.equals("a") && !op.equals("b") && !op.equals("c") && !op.equals("d")) {
                throw new InvaliedOptionExeption("Your option is invalid! Please select from a, b, c, or d.");
            }
            if (op.equals("a")) {
                System.out.println("Your selected game is Temple Run");
            } else if (op.equals("b")) {
                System.out.println("Your selected game is Subway Surf");
            } else if (op.equals("c")) {
                System.out.println("Your selected game is Angry Birds");
            } else {
                System.out.println("Your selected game is Blue Whale");
            }

        } catch (InvaliedOptionExeption e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
