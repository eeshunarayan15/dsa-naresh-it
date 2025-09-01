package com.mainapp;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
       int [] digits = {1,2,3};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));

    }
    public static int[] plusOne(int[] digits) {
        StringBuffer val=new StringBuffer();
        for(int i=0;i<digits.length;i++){
            val.append(digits[i]);
        }
        int num = Integer.parseInt(val.toString());

num=num+1;

        String numStr = Integer.toString(num);
        int[] result = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            result[i] = numStr.charAt(i) - '0'; // Convert char to int
        }


        return result;
    }
}
