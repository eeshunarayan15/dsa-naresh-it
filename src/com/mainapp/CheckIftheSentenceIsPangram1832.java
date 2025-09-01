package com.mainapp;

import java.util.HashSet;

public class CheckIftheSentenceIsPangram1832 {
    public static void main(String[] args) {
String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean b = checkIfPangram(sentence);
        System.out.println(b);
//        Output: true
//        Explanation: sentence contains at least one of every letter of the English alphabet.`
    }
    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {

            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }

        return set.size() == 26;

    }
}
