package com.mainapp.recursion;

public class Factorial {
    public static void main(String[] args) {
        
                System.out.println(factorial(10));
            }
        
            private static long factorial(long i) {

if(i==1||i==0)
{
    return 1;
} else

                return factorial(i-1)*i;

            }

}
