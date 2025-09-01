package com.mainapp;

public class MaxElemInArrayRecursive {
    public static void main(String[] args) {
        int arr[]={33,45,4545,545,55,};
        @SuppressWarnings("unused")
        int res=maxInArray(arr,arr.length-1);
    }

    private static int maxInArray(int[] arr, int length) {

//        if(length==0) return arr[0];
//        return  arr[length]>maxInArray(arr,length-1);
        return 1;
    }
}
