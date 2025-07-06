package com.mainapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray2089 {
    public static void main(String[] args) {
//        Input: nums = [1,2,5,2,3], target = 2
//        Output: [1,2]
//        Explanation: After sorting, nums is [1,2,2,3,5].
//        The indices where nums[i] == 2 are 1 and 2.
        int [] nums = {1,2,5,2,3};
        int target = 2;
        List<Integer> integers = targetIndices(nums, target);
        System.out.println(integers);
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> integers = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                integers.add(i);

            }
        }
       return integers;
    }
}
