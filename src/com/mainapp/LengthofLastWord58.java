package com.mainapp;
public class LengthofLastWord58 {
    public static void main(String[] args) {
//        Input: s = "luffy is still joyboy"
        String s="luffy is still joyboy";
        int i = lengthOfLastWord(s);
        System.out.println(i);
    }
    public static int lengthOfLastWord(String s) {

        String[] s1 = s.split(" ");
//        System.out.println(Arrays.toString(s1));
        String s2=s1[s1.length-1];
//        System.out.println(s2);
//        System.out.println();
        return s2.length();



    }
}
