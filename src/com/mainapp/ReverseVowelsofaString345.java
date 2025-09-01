package com.mainapp;

public class ReverseVowelsofaString345 {
    public static void main(String[] args) {
        String s = "IceCreAm";
//
//        Output: "AceCreIm"
        String vowels = reverseVowels(s);
        System.out.println(vowels);
    }

    public static String reverseVowels(String s) {
        char[] charArray = s.toCharArray();

        int start = 0, end = s.length() - 1;
    String vowels = "aeiouAEIOU";
        while (start < end) {

            while(start <end && vowels.indexOf(charArray[start])==-1){
                start++;
            }
            while(start<end && vowels.indexOf(charArray[end])==-1){
                end--;
            }
            char temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }


         return  new String(charArray);


    }
}
