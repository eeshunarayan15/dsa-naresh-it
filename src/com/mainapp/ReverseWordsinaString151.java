package com.mainapp;
public class ReverseWordsinaString151 {
    public static void main(String[] args) {
    String  s = "the sky is blue";
//        Output: "blue is sky the"
        String result = reverseWords(s);
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        String[] split = s.trim().split("\\s+");


        int start =0 , end= split.length-1;
        while(start<end){
     String temp=split[start];
 split[start]=split[end];
 split[end]=temp;
 start++;
 end--;

        }
        StringBuffer sb = new StringBuffer();
    for(int i=0;i<split.length;i++){
        sb.append(split[i]);
        if(i!=split.length-1){
            sb.append(" ");
        }
    }
 return  sb.toString();

    }
}
