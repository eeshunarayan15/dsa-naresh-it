package com.mainapp;

import java.util.Arrays;

public class FirstMissingPositvieNumber {
    public static void main(String[] args) {
//        Input: nums = [1,2,0]
//        Output: 3
//        Explanation: The numbers in the range [1,2] are all in the array.
        int nums []= {1,2,0};
        int res = firstMissingPositive(nums);
        System.out.println(res);
    }
    public static int firstMissingPositive(int[] nums) {
       int flag = 0;
        Arrays.sort(nums);
        @SuppressWarnings("unused")
        String string = Arrays.toString(nums);
//        System.out.println(string);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==i){
                flag=i;
            }
        }
        return  flag;
    }
}
