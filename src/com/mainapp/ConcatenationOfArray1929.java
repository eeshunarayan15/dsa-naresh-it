package com.mainapp;

public class ConcatenationOfArray1929 {
    public static void main(String[] args) {
//        Input: nums = [1,2,1]
//        Output: [1,2,1,1,2,1]
//        Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]
//        Input: nums = [1,3,2,1]
//        Output: [1,3,2,1,1,3,2,1]
//        Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
//        - ans = [1,3,2,1,1,3,2,1]
        @SuppressWarnings("unused")
        int arr[]={1,2,1};
       int [] nums = {1,3,2,1};
getConcatenation(nums);
    }
    public static int[] getConcatenation(int[] nums) {
        int ans[]=new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
 return  ans;
    }
}
