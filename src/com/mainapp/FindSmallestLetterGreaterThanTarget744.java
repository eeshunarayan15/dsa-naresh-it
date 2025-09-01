package com.mainapp;

public class FindSmallestLetterGreaterThanTarget744 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

       char [] letters = {'c','f','j'};
        char target2 = 'c';
//        Output: "f"
  
       char [] arr={'c', 'f', 'j'};

        char target = 'a';
//        char c = nextGreatestLetter(arr, target);
        char c = nextGreatestLetter(letters, target2);

        System.out.println(c);
    }
    public static char nextGreatestLetter(char[] letters, char target) {

        for(int i=0;i<letters.length;i++){
         if(letters[i]==target){
             return letters[i+1];
         }
        }


       return letters[0];
    }
}
