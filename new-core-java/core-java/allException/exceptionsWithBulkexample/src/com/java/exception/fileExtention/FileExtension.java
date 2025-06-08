package com.java.exception.fileExtention;

import java.util.Scanner;

public class FileExtension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the filename:");
        String filename = scanner.nextLine();

        try {
            int dotIndex = filename.lastIndexOf('.');
            if (dotIndex == -1 || dotIndex == filename.length() - 1) {
                throw new StringIndexOutOfBoundsException("Invalid file format: No extension found.");
            }

            String extension = filename.substring(dotIndex + 1);
            System.out.println("File extension is: " + extension);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
