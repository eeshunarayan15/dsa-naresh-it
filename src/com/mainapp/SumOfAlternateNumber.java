package com.mainapp;

import java.util.Scanner;

public class SumOfAlternateNumber {
    public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
     
      int sum[] = new int[n];
        for (int i = 0; i < n; i++) {
           sum[i]=sc.nextInt();
                
            }
            for(int i=0;i<n-1;i++){
                sum[i]=sum[i]+sum[i+1];
            }
             for(int i=0;i<n;i++){
                System.out.println(sum[i]);
            }
            sc.close();
        }
    

}
