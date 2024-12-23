package com.mainapp;

public class RectanglePattern {
    // 5432*
    // 543*1
    // 54*21
    // 5*321
    // *4321 row = col=5=N
    public static void main(String[] args) {
        int N = 5;
        for (int row = 1; row <= N; row++) {
            for (int col = 5; col >= 1; col--) {
                if (col == row) {
                    System.out.print("*");

                } else {
                    System.out.print(col);

                }

            }
            System.out.println();

        }

    }

}
