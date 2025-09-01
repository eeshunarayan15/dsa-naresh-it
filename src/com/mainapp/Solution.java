package com.mainapp;
public class Solution {
//patter of right angled triangle
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        int N = 4;

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {

                if (i == j) {
                    System.out.print("*");
                }

            }
            System.out.println();

        }

    }

}
