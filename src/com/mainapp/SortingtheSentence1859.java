package com.mainapp;
public class SortingtheSentence1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String s1 = sortSentence(s);
        System.out.println(s1);
    }
    @SuppressWarnings("unused")
    public static String sortSentence(String s) {
StringBuffer sf=new StringBuffer();
        char[] charArray = s.toCharArray();
        String[] s1 = s.split(" ");

        String[] result = new String[s1.length];
        for (int i = 0; i < s1.length; i++) {
          int  c=s1[i].length();
          char c1=s1[i].charAt(c-1);
        String temp=s1[i].substring(0,c-1);
       result[c1-'0'-1]=temp;




        }
        for(String word:result){
            sf.append(word).append(" ");
        }
        return sf.toString();

    }
}
