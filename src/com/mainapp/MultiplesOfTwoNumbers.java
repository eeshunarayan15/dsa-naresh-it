package com.mainapp;

import java.util.Scanner;

public class MultiplesOfTwoNumbers {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int limit = 100;
        int commonMultiples = 0;

        for (int i = 1; i < limit; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                commonMultiples++;
            }
        }

        System.out.println(commonMultiples);
    }
}