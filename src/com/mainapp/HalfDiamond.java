package com.mainapp;

public class HalfDiamond {
    // *
    // ** n=3 (n) first print n rows
    // *** row=5 r=2n-1
    // ** n+n-1=2n-1
    // * (n-1) then print this
    // solve by your self
    public static void main(String[] args) {
        int N = 3;
        for (int r = 1; r <= N; r++) {
            for (int j = 1; j <= r; j++) {
                System.out.print("*");

            }
            System.out.println();

        }


        for (int r = N - 1; r >= 1; r--) {
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
