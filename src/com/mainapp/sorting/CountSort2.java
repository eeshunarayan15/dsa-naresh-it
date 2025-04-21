package com.mainapp.sorting;

import java.util.Arrays;

public class CountSort2 {
public static void main(String[] args) {
     int m=10;
        int arr[] = { 10, 5, 1, 3, -10, 2, 3, 9, 4, 3, 1, 4 };
     cs(arr,arr.length,-10,10);

}

private static void cs(int[] arr, int n, int a, int b) {
    int r=b-a+1;
    int count[]=new int[r];
    for (int i = 0; i < n; i++) {
        count[arr[i]-a]++;
    }
    int index=0;
    for (int i = 0; i < r; i++) {
        int x=count[i];
        for (int j = 0; j <= x; j++) {
            arr[index]=i+a;
        }
        
    }
    System.out.println(Arrays.toString(count));
}
}
