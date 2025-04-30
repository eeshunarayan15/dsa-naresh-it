package com.mainapp;

public class SumOfPairEqualsToK {
public static void main(String[] args) {
    int arr[]={3,10,-4,8,15,-7,23,12};
    sum(arr,arr.length,18);
    
}

private static void sum(int[] arr, int length, int k) {
    for(int i=0;i<length;i++){
        for (int j = 1; j < arr.length; j++) {
            if(arr[i]+arr[j]==k){
            System.out.println(arr[i]+" "+arr[j]);
        }
            
        }
    }
}
}
