package com.mainapp;

public class Pattern23 {
    // *
    // **
    // ***
    // **** row =4 col=4
    //star=
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            System.out.println();

        }

    }

}
