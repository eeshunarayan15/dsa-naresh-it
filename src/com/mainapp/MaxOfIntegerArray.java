package com.mainapp;

import java.util.Arrays;

public class MaxOfIntegerArray {
    public static void main(String[] args) {
        int arr[]={3,7,-2,15,8,12,-5,20,10,-13};
        int x=-1;
        int max = max(arr, x);
        System.out.println("Max value is "+max);

    }

    private static int max(int[] arr, int x) {
        int lo=0;
        int hi=arr.length-1;
            int ans=Integer.MIN_VALUE;
            System.out.println(ans);
            Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if (arr[mid] == x) {
                return arr[mid]; // Exact match → floor found
            } else if (arr[mid] < x) {
                ans = arr[mid];  // Candidate for floor
                lo = mid + 1;    // Move right to find larger floor
            } else {
                hi = mid - 1;    // Move left
            }
        }
        return ans;
    }
}
