package com.mainapp;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();// size of an array
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the num for index : " + (i + 1) + " : ");
            int x = sc.nextInt();
            arr[i] = x;
            System.out.println((i + 1) + " " + Arrays.toString(arr));
        }
        System.out.print("Unique elements are : ");
        for (int i = 0; i < n; i++) {
            int key = arr[i];

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == key) {
                    count++;
                }
                System.out.println();

            }
            if (count == 1) {
                // System.out.println("Unique element : ");
                System.out.print(key + " ");
            }

        }
        sc.close();
    }

}
