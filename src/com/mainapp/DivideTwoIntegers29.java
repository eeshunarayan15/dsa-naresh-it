package com.mainapp;

public class DivideTwoIntegers29 {
    public static void main(String[] args) {
//        Example 1:
//
//        Input: dividend = 10, divisor = 3
//        Output: 3
//        Explanation: 10/3 = 3.33333.. which is truncated to 3.
        int n= -2147483648;
        int n2=-1;
                divide(n,n2);
    }
    public static int divide(int dividend, int divisor) {
//        2147483647

        int n=dividend/divisor;
        System.out.println(n);
        return  n;

    }

}
