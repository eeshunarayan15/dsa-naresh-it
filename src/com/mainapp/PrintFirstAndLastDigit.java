package com.mainapp;

public class PrintFirstAndLastDigit {
    public static void main(String[] args) {
        int n = 1265;

        // Get the last digit
        int lastDigit = n % 10;

        // Get the first digit
        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Print the first and last digits
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}
