package com.mainapp;

import java.util.Scanner;

public class SumOfNGeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
      double r= sc.nextDouble();
        int n = sc.nextInt();
        double currentTerm= a;
         double sum=0;
      for ( int i = 0; i < n; i++ ) {
          sum+=currentTerm;
   currentTerm*=r;
      }
      System.out.println(sum);
        sc.close();
    }
}
