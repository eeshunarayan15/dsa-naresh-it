package com.mainapp;

import java.util.Arrays;

class cb {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 2, 2, };
        cb solution = new cb();
        boolean result = solution.containsDuplicate(nums);
     System.out.println(result);

    }

    @SuppressWarnings("unused")
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            int x = nums[i];
            System.out.println(x);
            
            for (int j = i + 1; j < nums.length; j++) {
                
                int flag = 0;
                if (x == nums[j]) {
                    System.out.println(x);
                    return true;
                }
            }
        }

        return false;
    }

}
