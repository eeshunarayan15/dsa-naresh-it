package com.mainapp.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int ar[] = { 3, 10, 8, 2, 7, -5, 15, 8, 1, 12 };
        int low = 0;
        int high = ar.length - 1;//this will give last index of array
        ms(ar, low, high);
        System.out.println(Arrays.toString(ar));

    }

    private static void ms(int[] ar, int low, int high) {
  
        if (low == high)
            return;
        int mid = (low + high) / 2;
        System.out.println(mid);

        ms(ar, low, mid);
        ms(ar, mid + 1, high);
        merge(ar, low, high);
    }

    private static void merge(int[] ar, int low, int high) {
        int mid = (low + high) / 2;
        int p1=low;
        int p2=mid+1;
        int c[]=new int[high-low+1];
        int index=0;
        while(p1<=mid&& p2<=high){
            if(ar[p1]<ar[p2]){
                c[index++]=ar[p1++];
            }else{
                c[index++]=ar[p2++];

            }

        }
        while (p1<=mid) {
            c[index++]=ar[p1++];
            
        }
           while (p2<=high) {
            c[index++]=ar[p2++];
            
        }
        for(int i=0;i<c.length;i++){
            ar[low+i]=c[i];
        }
        // System.out.println(Arrays.toString(c)+"C Array");

    }

}
