package com.mainapp;

public class Pattern4 {
    public static void main(String[] args) {
        int N = 4;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
