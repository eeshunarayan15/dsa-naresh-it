package com.mainapp;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;

    
       System.out.print(a+" "+b);


        for (int i=3;i<n;i++){
           int  c=a+b;
            System.out.print(" "+c+" ");
            a=b;
            b=c;
            
        }
        
    }

}
