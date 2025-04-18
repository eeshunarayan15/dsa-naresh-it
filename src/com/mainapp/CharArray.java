package com.mainapp;

import java.util.Arrays;
import java.util.Scanner;

public class CharArray {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");

     char arr[]=new char[scanner.nextInt()];
     for(int i = 0; i < arr.length; i++) {
         arr[i]= scanner.next().charAt(0);
     }
System.out.println(Arrays.toString(arr));
scanner.close();
    }}
