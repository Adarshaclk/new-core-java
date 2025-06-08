package com.java.exception.configFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConfigFile {
    public static void main(String[] args) {
        String mainConfigPath ="D:\\project\\config\\main-config.txt";
        String backupConfigPath = "D:\\project\\config\\backup-config.txt";

        try {
            System.out.println("Trying to load main config...");
            loadConfig(mainConfigPath);
            System.out.println("Main config loaded successfully.");

        } catch (FileNotFoundException e) {
            System.out.println(" Main config not found: " + e.getMessage());
            try {
                System.out.println("Trying to load backup config...");
                loadConfig(backupConfigPath);
                System.out.println(" Backup config loaded successfully.");
            } catch (FileNotFoundException ex) {
                System.out.println(" Failed to load both main and backup config files.");
            }
        }
    }
    public static void loadConfig(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("Config Line: " + line);
        }

        scanner.close();
    }

}
