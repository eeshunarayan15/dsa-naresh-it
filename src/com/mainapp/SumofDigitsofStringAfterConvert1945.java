package com.mainapp;
public class SumofDigitsofStringAfterConvert1945 {
    public static void main(String[] args) {
//        For example, if s = "zbax" and k = 2, then the resulting integer
//        would be 8 by the following operations:
//
//        Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
//        Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
//        Transform #2: 17 ➝ 1 + 7 ➝ 8
//        Return the resulting integer after performing the operations described above.
//        int zbax = getLucky("zbax", 2);
        int zbax = getLucky("leetcode", 2);

        System.out.println(zbax);

    }
    @SuppressWarnings("unused")
    public  static int getLucky(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();

        int len = s.length();
   ;
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i)-'a'+1;
            stringBuilder.append(val);

        }

        String str=stringBuilder.toString();

        while (k > 0) {
        int sum=0;
          for(int i=0;i<str.length();i++){
              sum+=str.charAt(i)-'0';
          }
          str=String.valueOf(sum);
            k--;
        }

        return Integer.parseInt(str);
    }
}
