package com.mainapp;

import java.util.Arrays;
import java.util.Scanner;

public class AltTabProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };
        mostUsedTab(arr, sc);

    }

    @SuppressWarnings("unused")
    private static void mostUsedTab(int[] arr, Scanner sc) {
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the index between 0 and 4");
        int index = sc.nextInt();
        if (index < 0 || index > 4) {
            System.out.println("Invalid index");
        } else {
            // {10,20,30,40,50};
            int temp = arr[index];
            for (int i = index; i < n; i++) {
                arr[i] = arr[i + 1];

            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
