package com.mainapp;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray1331 {
    public static void main(String[] args) {
//        Example 1:
//
//        Input: arr = [40,10,20,30]
//        Output: [4,1,2,3]
//        Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
//        Example 2:
//
//        Input: arr = [100,100,100]
//        Output: [1,1,1]
//        Explanation: Same elements share the same rank.
//        Example 3:
//
//        Input: arr = [37,12,28,9,100,56,80,5,12]
//        Output: [5,3,4,2,8,6,7,1,3]
        int  arr [] = {40,10,20,30};
        int[] result = arrayRankTransform(arr);
        System.out.println(Arrays.toString(result));


    }
    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int rank = 1;
     Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], rank++);
            }

        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = map.get(arr1[i]); // Replace with rank
        }
        return result;

    }

}
