package com.mainapp;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 3; i++) {
                A[i][j] = sc.nextInt();
            }
        }
        int B[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
        int min = Integer.MAX_VALUE;
        int res = cost(A, B);
        min = Math.min(res, min);
        System.out.println(min);
    }

    private static int cost(int[][] a, int[][] b) { 
        return 2;
    }

}
