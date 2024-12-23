package com.mainapp;

public class InvertedPyramidPattern {
    // * * * * * 
    // *     * 
    // *   * 
    // * * 
    // * 
    
    public static void main(String[] args) {
        int n = 55;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
               
                if (col == 1||col==n-row+1||row==1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
               
            }
            System.out.println();

        }
    }

}
