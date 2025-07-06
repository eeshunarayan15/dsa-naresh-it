package com.mainapp;

import java.util.ArrayList;
import java.util.List;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray2535 {
//    Input: nums = [1,15,6,3]
//    Output: 9
//    Explanation:
//    The element sum of nums is 1 + 15 + 6 + 3 = 25.
//    The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
//    The absolute difference between the element sum and digit sum is |25 - 16| = 9.
    public static void main(String[] args) {
        int arr[]={1,15,6,3};
        int response    = differenceOfSum(arr);
        System.out.println(response);

    }
    public static int differenceOfSum(int[] nums) {
        int sum=0;
        int digitSum=0;
        int absolutedifference=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int n=nums[i];
            while(n>0){
                digitSum+=n%10;
                n=n/10;

            }
        }
        return absolutedifference=sum-digitSum;

    }
}
