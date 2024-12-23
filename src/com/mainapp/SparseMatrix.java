package com.mainapp;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r = sc.nextInt();
        System.out.print("Ente the number of elements for each row : ");

        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int totalElement = r * c;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("row number : " + (i + 1) + "  element : " + (j + 1));
                mat[i][j] = sc.nextInt();
                System.out.println("Row  " + "element " + mat[i][j]);

            }

        }
        int zero = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 0) {
                    zero++;

                }

            }

            
        }
        int nonZero = totalElement - zero;
        if (zero > nonZero) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
