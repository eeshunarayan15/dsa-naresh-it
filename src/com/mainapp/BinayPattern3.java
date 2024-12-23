package com.mainapp;

public class BinayPattern3 {
    public static void main(String[] args) {
        // int n = 1;
        // System.out.println(n/10);
        int N = 5;
        boolean flag = true;

        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                if (flag) {
                    System.out.print("0");
                    flag = false;
                } else {
                    System.out.print("1");
                    flag = true;
                }

            }
            System.out.println();
        }
    }

}
