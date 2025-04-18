package com.mainapp.sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 5, 12, 4, -3, 8, -1 };
        int n = arr.length;
        sort(arr, n);
    }

    private static void sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            //ye loop 0th element ko chod kar baaki element ke liye chalega
            int x = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (x < arr[j]) {
                    arr[j + 1] = arr[j];

                } else
                    break;
  
            }
            arr[j + 1] = x;

        }
        System.out.println(Arrays.toString(arr));
    }
}
