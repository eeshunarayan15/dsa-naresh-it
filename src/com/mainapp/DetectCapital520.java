package com.mainapp;

public class DetectCapital520 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
    
        String s="leetcode";
        String s1="USA";
        String s3="FlaG";
        boolean b = detectCapitalUse(s1);
        System.out.println(b);
    }
    public static boolean detectCapitalUse(String word) {

  int capcount=0;
  for(char w: word.toCharArray()){
      if(Character.isUpperCase(w)){
          capcount++;
      }

        }
      System.out.println(capcount+" Capcount");
  if(Character.isUpperCase(word.charAt(0)) ){
      if(capcount==1){
          return true;
      }else if(capcount==word.length()){
          return true;
      }
  }else if(capcount==0){
      return true;
  }
return  false;
    }
}
