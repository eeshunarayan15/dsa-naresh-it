package com.mainapp;

import java.util.Scanner;

public class TranposeMatrix {
    public static void main(String[] args) {
        System.out.println("Transpose of a matrix");
        System.out.println("Matrix is a square matrix");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element "+"row"+(i+1)+"column"+(j+1)+": ");
                matrix[i][j]= scanner.nextInt();
               
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
     
        int row = matrix.length;
        int col = matrix[0].length;
        int [][] transpose = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
            
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
               System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
