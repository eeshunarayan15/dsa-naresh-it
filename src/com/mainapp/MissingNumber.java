package com.mainapp;

public class MissingNumber {
    public static void main(String[] args) {
        // Given array
        int[] arr = new int[] { 1, 2, 6, 7, 8, 9, 10, 4, 3 };

        // Find the missing number using brute force
        int res = findMissingNumber(arr);

        // Print the result
        System.out.println("Missing number is: " + res);
    }

    // Brute force method to find the missing number
    private static int findMissingNumber(int[] arr) {
        // Outer loop to check numbers from 1 to 10
        for (int num = 1; num <= 10; num++) {
            boolean found = false;

            // Inner loop to check if 'num' is present in the array
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    found = true; // If found, mark as true
                    break; // No need to check further
                }
            }

            // If 'num' is not found in the array, return it
            if (!found) {
                return num;
            }
        }

        // If no missing number is found, return 0 (edge case)
        return 0;
    }
}
