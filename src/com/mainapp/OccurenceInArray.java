package com.mainapp;

import java.util.HashMap;

public class OccurenceInArray {
    int arr []={1,2,1,2,3,4,3,4,4,3,3,3,3,5,6,6};
    int res=occurenceInArray(arr);
    private int occurenceInArray(int[] arr) {
        HashMap<Integer,Integer> frequency=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        if(frequency.containsKey(arr[i])){
            
frequency.put(arr[i],frequency.get(arr[i])+1);
        }else{
            frequency.put(arr[i],1);
        }

    }
    return 1;

}
}