package com.java.exception.shoping;

import java.util.Scanner;

public class ShopingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the how many items you need to enter");
        int n = scanner.nextInt();
        String[] item = new String[n];
        System.out.println("enter the items");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ingredient " + (i + 1) + ": ");
            item[i] = scanner.nextLine();
        }
            try {
                System.out.println("enter the index to fetch");
                int j = scanner.nextInt();
                System.out.println("your selected items :" + item[j]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("error :" + e.getMessage());
            }
        }
    }

