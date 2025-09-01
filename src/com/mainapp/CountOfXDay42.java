package com.mainapp;

import java.util.Arrays;

public class CountOfXDay42 {
    public static void main(String[] args) {
//        int arr[]={1,3,5,3,3,8,-2,10,3,15,-7,-2,20,3};
//        int n=arr.length;
//        count(arr,n);
        System.out.println(Math.sqrt(4));
    }

    @SuppressWarnings("unused")
    private static void count(int[] arr, int n) {
        int ans[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1]){
                ans[i]=i++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
