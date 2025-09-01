package com.mainapp;

import java.util.HashSet;

public class CountPairsOfSimilarStrings2506 {
    public static void main(String[] args) {
      String [] words = {"aba","aabb","abcd","bac","aabc"};
//        Output: 2
        @SuppressWarnings("unused")
        int i = similarPairs(words);
    }
    public static int similarPairs(String[] words) {
        HashSet <Character> set = new HashSet<>();
        HashSet <Character> set2 = new HashSet<>();

int n=words.length;
        for (int i = 0; i < n-1; i++) {

            System.out.println(words[i]+"      "+words[i+1]);


        }


        System.out.println(set+"         set");
        System.out.println(set2+"         set2");
return  1;
    }
}
