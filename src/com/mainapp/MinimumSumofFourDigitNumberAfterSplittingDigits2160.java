package com.mainapp;


import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits2160 {
    public static void main(String[] args) {
//        Example 1:
//
//        Input: num = 2932
//        Output: 52
//        Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
//                The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
//        Example 2:
//
//        Input: num = 4009
//        Output: 13
//        Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc.
//                The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.
        int i = minimumSum(2932);
        System.out.println(i);

    }
    public static int minimumSum(int num) {
      int digit[]=new int[4];
      int i=0;
        while(num != 0){
            int rem=num%10;
            digit[i++]=rem;
            num=num/10;
        }
      Arrays.sort(digit);
//        System.out.println(Arrays.toString(digit));
        int num1=digit[0]*10+digit[2];
        int num2 =digit[1]*10+digit[3];
        int sum=num1+num2;
return  sum;
    }
}
