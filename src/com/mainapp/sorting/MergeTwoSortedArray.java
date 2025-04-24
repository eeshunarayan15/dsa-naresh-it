package com.mainapp.sorting;

import java.util.Arrays;
import java.util.TreeMap;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={3,8,10,18,25};
        int arr2[]={-2,1,5,9,11,13,14};
        
        sort(arr1,arr2,arr1.length,arr2.length);
    }
//TreeMap
//
    private static void sort(int[] arr1, int[] arr2, int length1, int length2) {
        int size=length1+length2;
        int arr[]=new int[size];
        System.out.println(Arrays.toString(arr));

        
        TreeMap<Integer, String> studentRoll = new TreeMap<>();



    }

}
