package com.mainapp;

import java.util.ArrayList;
import java.util.List;

public class TrappingRainWater42 {
    public static void main(String[] args) {
//        Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//        Output: 6
//        Explanation: The above elevation map (black section) is represented by array
//        [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
//                Example 2:
//
//        Input: height = [4,2,0,3,2,5]
//        Output: 9
    int   []  height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trap = trap(height);
        System.out.println(trap);
    }
    public static int trap(int[] height) {
int sum=0;
int n=height.length;

List<Integer> leftmax=getLeftMax(height ,n);
        List<Integer> rightmax=getRightMax(height ,n);
        for(int i=0;i<n;i++){
            int h=Math.min(leftmax.get(i), rightmax.get(i) -height[i]);
            sum+=h;
        }
        return sum;
    }

    private static List<Integer> getRightMax(int[] height, int n) {
// C++: vector<int> rightmax(n);
        // Java: List banao aur size set karo
        List<Integer> rightmax = new ArrayList<>();

        // ArrayList mein n elements add karo (initially 0)
        for(int i = 0; i < n; i++) {
            rightmax.add(0);
        }

        // C++: rightmax[n-1] = height[n-1];
        // Java: set() method use karo
        rightmax.set(n-1, height[n-1]);

        // C++: for(int i=(n-2);i>=0;i--)
        // Java: Same loop structure
        for(int i = (n-2); i >= 0; i--) {
            // C++: rightmax[i] = max(rightmax[i+1], height[i]);
            // Java: Math.max() aur get/set methods
            rightmax.set(i, Math.max(rightmax.get(i+1), height[i]));
        }

        // C++: return rightmax;
        // Java: Same return
        return rightmax;
    }

    private static List<Integer> getLeftMax(int[] height, int n) {
        List<Integer> leftmax = new ArrayList<>();
        // ArrayList mein n elements add karo (initially 0)
        for(int i = 0; i < n; i++) {
            leftmax.add(0);
        }

        // C++: leftmax[n-1] = height[n-1];
        // Java: set() method use karo
        leftmax.set(n-1, height[n-1]);

        // C++: for(int i=(n-2);i>=0;i--)
        // Java: Same loop structure
        for(int i = (n-2); i >= 0; i--) {
            // C++: leftmax[i] = max(leftmax[i+1], height[i]);
            // Java: Math.max() aur get/set methods
            leftmax.set(i, Math.max(leftmax.get(i+1), height[i]));
        }

        // C++: return leftmax;
        // Java: Same return
        return leftmax;
    }
}
