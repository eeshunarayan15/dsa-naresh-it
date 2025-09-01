package com.mainapp.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSort1 {
    @SuppressWarnings("unused")
    private static ArrayList<Object> arrayList;

    public static void main(String[] args) {
        int m=10;
        int arr[] = { 3, 5, 1, 3, 10, 2, 3, 9, 4, 3, 1, 4 };
        int count[] = new int[m+1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

        }
        int frequency = 0;
        @SuppressWarnings("unused")
        int element = 0;
        for (int i = 1; i < m+1; i++) {
            if (count[i] > frequency) {
                frequency = count[i];
                element = i;
            }
        }
        // System.out.println(element + " " + frequency);
        // System.out.println(Arrays.toString(count));
        // 0,2,1,4,2,1,0,0,0,1,1
        // 1,1,2,3,3,3,3,4,4,5,9,10
           int index=0;  
        for (int i = 0; i < m+1; i++) {
            int x = count[i];
           for(int j=1;j<=x;j++){
            arr[index]=i;
            index++;
           }
        }
        System.out.println(Arrays.toString(arr));
        //time complexity O(N+M)
        //SPACE Complexity O(M)

    }

}
