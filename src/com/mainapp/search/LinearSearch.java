package com.mainapp.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { -11, -4, 10, 15, 17, 20, 25, 30, 35 };
        boolean result = lsForSortedArray(arr, 9, 15);
        System.out.println(result);

    }

    private static boolean lsForSortedArray(int[] arr, int n, int key) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return true;
            }
        }

        return false;
    }

}
