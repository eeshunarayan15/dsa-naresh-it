package com.mainapp;

public class TimeComplexity {
    public static void main(String[] args) {
        // f4(2);
        // System.out.println(Math.sqrt(2));


        int count = 0;
        for (int i = 1; i < 10; i *= 2) {
            count++;
            System.out.println(count);
            
        }
    }

    private static void f4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Math.sqrt(n); j++) {
               System.out.println("hello"+i+j);
            }
        }
    }
}
