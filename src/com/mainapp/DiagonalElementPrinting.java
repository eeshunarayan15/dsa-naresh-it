package com.mainapp;

import java.util.Scanner;

public class DiagonalElementPrinting {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  int array[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},
  };
        int row = 3;
        int col = 3;
        // int[][] arr = new int[row][col];
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {

        //         System.out.print(array[i][j]);
        //     }
        //     System.out.println();
        // }
        System.out.println("Original Matrix:");
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         System.out.print(array[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println("Diagonal Elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j || (i + j) == (row - 1)) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
    }


