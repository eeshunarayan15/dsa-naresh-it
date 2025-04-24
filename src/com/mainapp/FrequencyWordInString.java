package com.mainapp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyWordInString {
    public static void main(String[] args) {
        
        String s="Hi i am there to solve the problem and to help you out of this";
        String[] wordStrings = s.split(" ");
        // System.out.println(Arrays.toString(wordStrings));
        HashMap<String,Integer> wordMap=new HashMap<>();
      for(int i=0;i<wordStrings.length;i++){
          wordMap.put(wordStrings[i],wordMap.getOrDefault(wordStrings[i],0)+1);
      }
      System.out.println(wordMap);
      // Step 2: Find max frequency word
        String maxWord = null;
        int maxCount = 0;

        // for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
        //     System.out.println(entry.getValue()+entry.getKey());
        //     if (entry.getValue() > maxCount) {
        //         maxWord = entry.getKey();
        //         maxCount = entry.getValue();
        //     }
        // }
for(Map.Entry<String,Integer>  entry:wordMap.entrySet()){
    
            System.out.println(entry.getValue()+entry.getKey());

}

        System.out.println("Most frequent word: " + maxWord + " -> " + maxCount + " times");
    }

}
