package com.mainapp;

//Day 10
public class PalindromePyramidPattern {
    // N=5
    // row =N
    // A
    // A B A
    // A B C B A
    // A B C D C B A
    // A B C D E D C B A
    // 2(row-1)
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            char ch = 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
                ch++;

            }
            
            ch--;
            // System.out.print(" " +ch +" ch after the firs part");
            for (int c = 1; c <= row - 1; c++) {
             
                --ch;
                // System.out.print(" " + ch + " ch inside the second part");
                   System.out.print(ch+" ");
            }
            System.out.println();

        }
    }
}
