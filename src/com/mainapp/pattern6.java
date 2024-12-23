package com.mainapp;

public class pattern6 {
    // **** row 4 col 4 white space n-1
    // *** c=n-r+1
    // ** 4-1+1
    // * 4-2+1
    // n to 1
    // 4
    // 3
    // 2
    // 1

    public static void main(String[] args) {
        int N = 45;
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N - row + 1; col++) {
                System.out.print(col);

            }
            System.out.println();

        }

    }

}
