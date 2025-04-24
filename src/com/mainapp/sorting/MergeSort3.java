package com.mainapp.sorting;

import java.util.Arrays;

public class MergeSort3 {

    public static void main(String[] args) {
        int a[] = new int[12];
        int b[] = new int[7];

        a[0] = 3;
        a[1] = 8;
        a[2] = 10;
        a[3] = 18;
        a[4] = 25;

        b[0] = -2;
        b[1] = 1;
        b[2] = 5;
        b[3] = 9;
        b[4] = 11;
        b[5] = 13;
        b[6] = 14;

        mergeSortedArrays(a, b, 5, 7);
        System.out.println(Arrays.toString(a));

    }

    private static void mergeSortedArrays(int[] a, int[] b, int size1, int size2) {

        for (int i = 0; i < b.length; i++) {
            a[size1 + i] = b[i];

        }

        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (x < a[j]) {
                    a[j + 1] = a[j];

                } else
                    break;

            }
            a[j + 1] = x;

        }

    }
}
