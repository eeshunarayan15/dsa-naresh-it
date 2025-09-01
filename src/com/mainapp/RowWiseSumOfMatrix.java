package com.mainapp;

import java.util.Scanner;

public class RowWiseSumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of rows and columns
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();

        // Step 2: Declare matrix
        int[][] mat = new int[r][c];

        // Step 3: Input matrix elements
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
            System.out.println("for row"+i+"of index"+j);
                mat[i][j] = sc.nextInt();
            }
        }

        // Step 4: Display the matrix
        System.out.println("The matrix you entered is:");
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {

                sum = sum + mat[i][j];
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("sum"+sum); // Move to next line for better readability
        }

        // // Step 5: Row-wise sum calculation
        // System.out.println("Row-wise sums of the matrix:");
        // for (int i = 0; i < r; i++) {
        //     int rowSum = 0;
        //     for (int j = 0; j < c; j++) {
        //         rowSum += mat[i][j];
        //     }
        //     System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        // }

        sc.close(); // Close the scanner3

    }
}
