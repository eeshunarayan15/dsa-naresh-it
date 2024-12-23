package com.mainapp;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Sqare");
      int n=  sc.nextInt();
       for (int i=1;i<=n;i++){
     for(int c=1;c<=n;c++){
        System.out.print("*");
        }
System.out.println();
sc.close();
       }
    }
}
