package com.mainapp;

public class AlternatingDigitSum2544 {
    public static void main(String[] args) {
//        Input: n = 521
//        Output: 4
//        Explanation: (+5) + (-2) + (+1) = 4.
        int i = alternateDigitSum(521);;
        System.out.println(i);
    }
    public static int alternateDigitSum(int n) {
        int res=0;
        String s=+n+"";
        System.out.println(s);
        int length =s.length();
        for(int i=0;i<length;i++){
            int digit=s.charAt(i)-'0';
            if(i%2==0){
            res+=digit;
            }else{
                res-=digit;
            }
        }
       return  res;
    }
}

