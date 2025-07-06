package com.mainapp;

import java.util.HashMap;

public class RomanNumberToInteger13 {
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public static void main(String[] args) {
        String s="LVIII";
        int i = romanToInt(s);

        System.out.println(i);
    }
    public static  int romanToInt(String s) {
        HashMap<Character, Integer> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put('I', 1);
        objectObjectHashMap.put('V', 5);
        objectObjectHashMap.put('X', 10);
        objectObjectHashMap.put('L', 50);
        objectObjectHashMap.put('C', 100);
        objectObjectHashMap.put('D', 500);
        objectObjectHashMap.put('M', 1000);
        System.out.println(s.length()-1);
        int res=objectObjectHashMap.get(s.charAt(s.length()-1));
        System.out.println(res+" res");
        System.out.println(s.length()-2+" length");
        for(int i=s.length()-2;i>=0;i--){
            System.out.println(i+"  i");
            if(objectObjectHashMap.get(s.charAt(i))<objectObjectHashMap.get(s.charAt(i+1))){
                res-=objectObjectHashMap.get(s.charAt(i));
            }else {
                res+=objectObjectHashMap.get(s.charAt(i));
            }
        }




        return  res;

    }
}
