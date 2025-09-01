package com.mainapp;

import java.util.Scanner;

@SuppressWarnings("unused")
public class SumOfADigit {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        int n = 1;

       
        int result = sum(n);
        // System.out.println("Result : "+result);
        // scanner.close();

        String m = "00122222222222";

      
        long result1 = digigStringSum(m);
        // System.out.println("result1"+result1);

    }

    private static long digigStringSum(String g) {
        long sum1 = 0;

        for (int j = 0; j < g.length(); j++) {
            char ch = g.charAt(j);

            sum1 = sum1 + ch - 48;
            System.out.println("char : " + ch);
            System.out.println("Sum1 : " + sum1);

        }
        System.out.println(sum1);
        return sum1;
    }

    private static int sum(int n) {

        int sum = 0;

        while (n != 0) {
            // 123
            int reaminder = n % 10;
            n = n / 10;
            sum = sum + reaminder;
            // System.out.println("remainer :"+reaminder);
            // System.out.println("Sum : "+sum);
            // System.out.println("n value : " +n);
            // System.out.println("********************");
        }
        return sum;

    }

}

// a=97
// A=65
// 0=48