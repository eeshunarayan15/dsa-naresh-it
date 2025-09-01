package com.mainapp;

import java.util.Scanner;

public class AdditionOfTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input the number of rows and columns
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();

        // Create the first matrix A
        int[][] A = new int[r][c];
        System.out.println("Enter the elements of matrix A row by row:");
        // Collect data for matrix A
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // Clear input prompt for user understanding
                System.out.println("Enter element for row " + i + " and column " + j + " of matrix A:");
                A[i][j] = sc.nextInt();
            }
        }

        // Create the second matrix B
        int[][] B = new int[r][c];
        System.out.println("Enter the elements of matrix B row by row:");
        // Collect data for matrix B
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // Clear input prompt for user understanding
                System.out.println("Enter element for row " + i + " and column " + j + " of matrix B:");
                B[i][j] = sc.nextInt();
            }
        }

        // Display the first matrix A
        System.out.println("Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(A[i][j] + " "); // Print elements of A
            }
            System.out.println(); // Move to next line after each row
        }

        // Display the second matrix B
        System.out.println("Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(B[i][j] + " "); // Print elements of B
            }
            System.out.println(); // Move to next line after each row
        }

    
    
        for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
        System.out.print(A[i][j]+B[i][j]+"  " ); // Print elements of B
        }
        System.out.println(); // Move to next line after each row
        }
    
    
        sc.close();
        ;
    
    }
}
