package com.java.exception.music;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MusicFileReader {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\surya\\Music\\Diwaani\\Deewani Mastani Bajirao Mastani 128 Kbps.mp3");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            System.out.println(" Songs List:");
            while (scanner.hasNextLine()) {
                String song = scanner.nextLine();
                System.out.println("- " + song);
                System.out.println("Deewani Mastani Bajirao Mastani7  ");
            }

        } catch (FileNotFoundException e) {
            System.out.println(" Error: songs.txt file not found.");
        } finally {
            scanner.close();
        }
    }
}
