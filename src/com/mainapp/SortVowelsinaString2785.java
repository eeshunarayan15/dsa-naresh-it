package com.mainapp;

public class SortVowelsinaString2785 {
    public static void main(String[] args) {
//        Input: s = "lEetcOde"
//        Output: "lEOtcede"
//        Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd' are all consonants.
//                The vowels are sorted according to their ASCII values, and the consonants remain in the same places.
        String s="lEetcOde";
        String s1 = sortVowels(s);
        System.out.println(s1);


    }
    public static String sortVowels(String s) {
     char[] vowels={
                'a','e','i','o','u','A','E','I','O','U'
        };
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(vowels[i]=='e'){}
        }
        return s;

    }
}
