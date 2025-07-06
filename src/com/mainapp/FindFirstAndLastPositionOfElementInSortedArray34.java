package com.mainapp;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray34 {
    public static void main(String[] args) {
//        Input: nums = [5,7,7,8,8,10], target = 8
//        Output: [3,4]
   int []     nums = {5,7,7,8,8,10};
   int target = 8;
        int[] ints = searchRange(nums, target);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] searchRange(int[] nums, int target) {
        int out[]={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(out[0]==-1){
                    out[0]=i;
                }
                out[1]=i;

            }
        }
        return out;

    }
}
