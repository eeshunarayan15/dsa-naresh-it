package com.mainapp;
import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter2942 {
    public static void main(String[] args) {
//        Input: words = ["leet","code"], x = "e"
//        Output: [0,1]
//        Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
        String []words = {"leet","code"};
        char x = 'e';
        List<Integer> wordsContaining = findWordsContaining(words, x);
        System.out.println(wordsContaining);
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> integers = new ArrayList<>();
//        System.out.println(integers.size());
        for(int i=0;i<words.length;i++){
            char[] charArray = words[i].toCharArray();
            for(int j=0;j<charArray.length;j++){
                if(charArray[j]==x){
                    integers.add(i);
                    break;
                }
            }
        }
//        for(String word:words){
//            char[] charArray = word.toCharArray();
//            for(char character : charArray){
//                if(character==x){
//                    integers.add(charArray.length);
//                }
//
//            }
//        }
        return integers;

    }
}
