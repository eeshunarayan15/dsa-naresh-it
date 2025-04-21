package com.mainapp;

import java.util.HashMap;

public class MaxFrequnecyHasMapApproach {
    public static void main(String[] args) {
        int arr[]={3,5,1,3,10,2,3,9,4,3,1,4,};
        int n=arr.length;
        maxFrequency(arr,n);
        
    }

    private static void maxFrequency(int[] arr, int n) {
       HashMap<Integer,Integer> hashmap=new HashMap<>();
       for (int i = 0; i <n; i++) {
        int curretfreq=0;
        int x=arr[i];
        for (int j = 0; j < n; j++) {
            if(x==arr[j]){
                curretfreq++;
                hashmap.put(x, curretfreq);
              
                
                System.out.println(x+" "+curretfreq);
            }
            
        }
      
        
       }


       System.out.println(hashmap);
    }

}
