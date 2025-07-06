package com.mainapp;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ScoreOfAString3110 {
    public static void main(String[] args) {
//        Input: s = "hello"
//
//        Output: 13
//
//        Explanation:
//
//        The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So,
//        the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
        String  s = "hello";
        int sum = scoreOfString(s);
        System.out.println(sum);
    }
    public static int scoreOfString(String s) {

        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        int sum=0;
//        System.out.println(Arrays.toString(bytes));
        for(int i=0;i<bytes.length-1;i++){
            int abs=Math.abs(bytes[i]-bytes[i+1]);
            System.out.println(bytes[i]+" "+bytes[i+1]+" "+abs);
//            System.out.print(abs+" abs");

            sum+=abs;
        }
        return sum;
    }
}
