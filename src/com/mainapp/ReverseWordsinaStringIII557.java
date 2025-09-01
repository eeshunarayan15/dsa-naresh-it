package com.mainapp;
public class ReverseWordsinaStringIII557 {
    public static void main(String[] args) {
//        Input: s = "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"
        String s = "Let's take LeetCode contest";
        @SuppressWarnings("unused")
        String s1 = reverseWords(s);
    }
    public static String reverseWords(String s) {

        String[] split = s.split(" ");



StringBuffer ans=new StringBuffer();
        for (int i = 0; i < split.length; i++) {
            String word=split[i];
            int n=word.length();
            StringBuffer sb=new StringBuffer();
            for (int j=n-1;j>=0;j--) {
                sb.append(word.charAt(j));
            }
         ans.append(sb.toString()+" ");
        }



          return  ans.toString().trim();
    }
}
