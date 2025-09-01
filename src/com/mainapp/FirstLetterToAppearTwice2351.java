package com.mainapp;
import java.util.HashMap;
public class FirstLetterToAppearTwice2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        char c = repeatedCharacter(s);
        System.out.println(c);
    }
    public static char repeatedCharacter(String s) {
        int length=s.length();
        System.out.println(length);
        HashMap<Character, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < length; i++) {
//            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
//        }
//        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
//            char key = entry.getKey();
//            int value = entry.getValue();
//
//        }
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (hashMap.containsKey(ch)) {
                return ch;
            } else {
                hashMap.put(ch, 1);

            }
        }

return ' ';
    }
}
