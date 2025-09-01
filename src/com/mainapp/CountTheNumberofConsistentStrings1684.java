package com.mainapp;

import java.util.HashSet;

public class CountTheNumberofConsistentStrings1684 {
    public static void main(String[] args) {
//        Input:
        String  allowed = "ab";
                 String [] words= {"ad","bd","aaab","baa","badab"};
//        Output: 2
//        Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
        int i = countConsistentStrings(allowed, words);
        System.out.println(i);
    }public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        int count=0;
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for(int i=0;i<words.length;i++){
            boolean flag=true;
           String word=words[i];
          for(int j=0;j<word.length();j++){
              if(!set.contains(word.charAt(j))){
                   flag=false;
                   break;
              }
          }
          if(flag){
              count++;
          }
        }
//        System.out.println(set+" set");
//        System.out.println("count:"+count);
        return count;
    }

}
