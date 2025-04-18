package com.mainapp;

import java.util.Scanner;

public class SetBit {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
   int n = scanner.nextInt();
   int c=0;
   for (int i = 0; i < 32; i++) {
         if (checkBit(n, i)) {
              c++;
         }
    
   }
    System.out.println(c);
}

public static boolean checkBit(int n, int i) {
    return ((n >> i) & 1) == 1;
}



}
