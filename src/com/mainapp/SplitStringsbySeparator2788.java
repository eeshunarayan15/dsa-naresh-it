package com.mainapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStringsbySeparator2788 {
    public static void main(String[] args) {
//        Input: words = ["one.two.three","four.five","six"], separator = "."
        char separator = '.';
        List<String> list = List.of("one.two.three","four.five","six");
//        Output: ["one","two","three","four","five","six"]
//        Explanation: In this example we split as follows:
        @SuppressWarnings("unused")
        List<String> strings = splitWordsBySeparator(list, separator);
    }
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list=new ArrayList<>();

        String regexSeparator = "\\" + separator;
        for(String word: words){
            String[] split = word.split(regexSeparator);
          list.addAll(Arrays.asList(split));
        }
        System.out.println(list);
        return list;


    }
}
