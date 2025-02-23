package com.mainapp;

public class SumOfADigit2 {
    public static void main(String[] args) {
        int n = 123;
        int sum = digit(n);
        System.out.println(sum);
            }
        
            private static int digit(int n) {
                int sum = 0;

                while (n >0) {
                    int remainer = n % 10;
                    n = n / 10;
                    sum = sum+remainer;
                    System.out.println(sum);
                 
                    
                    
                }
            
                return sum;
            }
    

}
