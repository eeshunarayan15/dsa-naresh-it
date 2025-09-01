package com.mainapp;

public class ArrayMultiplyRecurisve {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,};
        int res=multiply(arr,arr.length-1);
        System.out.println(res);
    }

    private static int multiply(int[] arr, int length) {
        if(length==0) return arr[0];
        return arr[length]*multiply(arr,length-1);
    }
}
