package com.mainapp;

import java.util.Scanner;

public class FindFactorialForSmallinputRagne {
    // Given a non negative number -N PrintN!
    // input contains a number -N
    // constraints
    // 0<=N<=20
    // 4=4*3*1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        long N = sc.nextInt();
        long fact = 1;
        for (long i = 1; i <= N; i++) {
            fact = fact * i;
            // System.out.println(fact);

        }
        System.out.println("Factorial : " + N + " " + "(" + fact + ")");
        sc.close();
        ;
    }

}
