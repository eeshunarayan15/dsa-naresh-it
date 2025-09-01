package com.mainapp;

import java.util.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {
//        Input: nums = [3,2,2,3], val = 3
//        Output: 2, nums = [2,2,_,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//        It does not matter what you leave beyond the returned k (hence they are underscores).

        int []nums = {3,2,2,3};
        int i = removeElement(nums, 3);
        System.out.print(i);
    }
    public static int removeElement(int[] nums, int val) {
        //        Input: nums = [3,2,2,3], val = 3

        //        Output: 2, nums = [2,2,_,_]
            int count=0;
        int[] clone = nums.clone();
        for(int i=0;i<nums.length;i++){
            if(clone[i]==val) {
                nums[i]=clone[i+1];
            }else {
                nums[i]=0;
            }
        }
        System.out.println(Arrays.toString(nums));
            return  count;
    }
}
