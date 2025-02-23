package com.mainapp;

public class SumOfDigitStringBasedAppraoch {
    public static void main(String[] args) {
        String n = "123";
        long result = digitsSum(n);
       System.out.println(result);
        
            }
        
            private static long digitsSum(String n) {
                long sum = 0;
                for (int i = 0; i < n.length(); i++) {
                    char ch = n.charAt(i);
                    sum = sum + ch-48;
                    // System.out.println(sum);
                }
                return  sum;
                
            }

}
