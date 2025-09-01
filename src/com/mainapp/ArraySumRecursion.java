package com.mainapp;

public class ArraySumRecursion {
    public static void main(String[] args) {
        int arr []={1,2,3,4};
        int res=sumRec(arr,arr.length-1);
        System.out.println(res);
    }

    private static int sumRec(int[] arr, int length) {
        if (length==0) return arr[0];
        return  arr[length] + sumRec(arr, length-1);

    }
}
