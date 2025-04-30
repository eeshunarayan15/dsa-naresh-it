package com.mainapp;

import java.util.HashMap;

public class CountTheElementsWithMaximumFrequnecy {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,4};
        frequency(arr,arr.length);
        
    }

    private static void frequency(int[] arr, int length) {
       
          HashMap<Integer,Integer> freq= new HashMap<>();

          for(int i=0;i<length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
          }
       //max frequnecy
       int mf=0;
       for(int key :freq.keySet()){
        if(mf<freq.get(key))
        mf=freq.get(key);
       }

         int res=0;
       for(int key :freq.keySet()){
        if(mf==freq.get(key))
        res+=freq.get(key);
       }
       System.out.println(res);

    }

}
