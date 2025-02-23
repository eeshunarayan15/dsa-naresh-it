package com.mainapp.recursion;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int result = sumOfNaturalNumber(4);
        System.out.println(result);
            }
        
            private static int sumOfNaturalNumber(int i) {
                if (i == 1) {

                    return 1;
                }
                return sumOfNaturalNumber(i - 1) + i;
            }

}
