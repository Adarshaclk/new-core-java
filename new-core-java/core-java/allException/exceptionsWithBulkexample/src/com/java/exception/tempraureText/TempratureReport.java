package com.java.exception.tempraureText;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TempratureReport {
    public static void main(String[] args) {
        File file = new File("D:\\project\\temp\\temprature.txt");

        try {
            Scanner scanner = new Scanner(file);

            boolean hasData = false;

            while (scanner.hasNextLine()) {
                hasData = true;
                String line = scanner.nextLine();
                System.out.println(line);
            }

            if (!hasData) {
                System.out.println(" The file is empty.");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(" File not found. Please check the path.");
        }
    }
}

