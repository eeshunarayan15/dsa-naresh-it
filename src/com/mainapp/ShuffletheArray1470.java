package com.mainapp;

import java.util.Arrays;

public class ShuffletheArray1470 {
    public static void main(String[] args) {
//        Example 1:
//
//        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
//        Example 2:
//
//        Input: nums = [1,2,3,4,4,3,2,1], n = 4
//        Output: [1,4,2,3,3,2,4,1]
//        Example 3:
//
//        Input: nums = [1,1,2,2], n = 2
//        Output: [1,2,1,2]
        int [] nums = {2,5,1,3,4,7};
        int  n = 3;
        int[] shuffle = shuffle(nums, n);
        System.out.println(Arrays.toString(shuffle));
    }
    public static int[] shuffle(int[] nums, int n) {
        @SuppressWarnings("unused")
        int[] clone = nums.clone();
        int [] ans=new int[nums.length];
//        System.out.println(Arrays.toString(clone));
//        {2,5,1,3,4,7}; n=3
        for(int i=0; i<n; i++){  // i = 0,1,2 (total 3 iterations)
            // i=0: positions 0,1 fill karo
            // i=1: positions 2,3 fill karo
            // i=2: positions 4,5 fill karo

            ans[2*i] = nums[i];      // X element
            ans[2*i+1] = nums[n+i];  // Y element
            //        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
        }
 return  ans;
    }
}
