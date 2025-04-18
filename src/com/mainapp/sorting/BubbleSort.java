package com.mainapp.sorting;

import java.util.Arrays;
//Day 34
public class BubbleSort {
    public static void main(String[] args) {
        int n=12;
        int arr[]={8,7,1,2,3,4,5,6,2,-2,-2,-4};
        for(int i=0;i<n-1;i++)
        {boolean flag=true;

            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                    flag=false;

                }
            }
            if(flag)
            break;
            System.out.println(Arrays.toString(arr));
        }
        
    }

}
