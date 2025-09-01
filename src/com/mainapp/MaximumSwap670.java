package com.mainapp;

import java.util.Arrays;

public class MaximumSwap670 {
    public static void main(String[] args) {
        int res = maximumSwap(9973);
        System.out.println(res);
    }

    public static int maximumSwap(int num) {
        int maxNum = num;
        String string = Integer.toString(num);
        System.out.println(string+"no converted to string");
        char[] charArray = string.toCharArray();
        System.out.println(Arrays.toString(charArray)+"String converted to char array");

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                int currentNum = Integer.parseInt(String.valueOf(charArray));
                System.out.println(currentNum+ "number converted to integer");
                if (currentNum > maxNum) {
                    maxNum = currentNum;

                }
                temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;


            }
        }
        return maxNum;


    }
}
