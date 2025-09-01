package com.mainapp;
public class RotateImage48 {
    public static void main(String[] args) {
//        Output: [[7,4,1],[8,5,2],[9,6,3]]
        int matrix[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
        };
        rotateImage(matrix);
    }

    private static void rotateImage(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix in-place (swap elements across the main diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row in-place
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;    
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
