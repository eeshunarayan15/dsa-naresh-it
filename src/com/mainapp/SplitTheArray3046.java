package com.mainapp;

import java.util.*;

public class SplitTheArray3046 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int arr[]={1,1,2,2,3,4};
        int nums []= {1,1,1,1};
        boolean possibleToSplit = isPossibleToSplit(nums);
        System.out.println(possibleToSplit);
    }
    public static boolean isPossibleToSplit(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
           map.put(n,map.getOrDefault(n,0)+1);
           if(map.get(n)>2){
               return false;
           }

        }
            return  true;
    }
}
